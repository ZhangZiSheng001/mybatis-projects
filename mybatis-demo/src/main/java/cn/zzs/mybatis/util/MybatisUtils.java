package cn.zzs.mybatis.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * <p>用于获取sqlSession的工具类</p>
 * @author: zzs
 * @date: 2020年3月29日 下午12:04:31
 */
public class MybatisUtils {

    private static SqlSessionFactory sqlSessionFactory;

    private static ThreadLocal<SqlSession> tl = new ThreadLocal<>();

    private static final Object obj = new Object();

    static {
        init();
    }

    /**
     * 
     * <p>获取SqlSession对象的方法，线程安全</p>
     * @author: zzs
     * @date: 2019年8月31日 下午9:22:29
     * @return: SqlSession
     */
    public static SqlSession getSqlSession() {
        // 从当前线程中获取连接对象
        SqlSession sqlSession = tl.get();
        // 判断为空的话，创建连接并绑定到当前线程
        if(sqlSession == null) {
            synchronized(obj) {
                if((sqlSession = tl.get()) == null) {
                    sqlSession = sqlSessionFactory.openSession();
                    tl.set(sqlSession);
                }
            }
        }
        return sqlSession;
    }

    /**
     * <p>根据指定配置文件初始化SqlSessionFactory对象</p>
     * @author: zzs
     * @date: 2019年9月1日 上午10:53:05
     * @return: void
     */
    private static void init() {
        try (InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml")) {
            // 加载配置文件，初始化SqlSessionFactory对象
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch(IOException e) {
            throw new RuntimeException("创建sqlSessionFactory失败", e);
        }
    }
}
