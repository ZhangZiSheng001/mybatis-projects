package cn.zzs.mybatis.util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionException;
import org.apache.ibatis.session.SqlSessionFactory;

import com.baomidou.mybatisplus.core.MybatisSqlSessionFactoryBuilder;

/**
 * <p>用于 SqlSession 对象的获取、事务提交、事务回滚、Mapper 获取</p>
 * @author: zzs
 * @date: 2020年3月29日 下午12:04:31
 */
public class MybatisUtils {

    private static SqlSessionFactory sqlSessionFactory;

    private static ThreadLocal<SqlSession> localSqlSession = new ThreadLocal<>();

    static {
        init();
    }

    private static void init() {
        try {
            // 加载配置文件，初始化SqlSessionFactory对象
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(inputStream);
            
        } catch(Exception e) {
            throw new RuntimeException("初始化SqlSessionFactory失败", e);
        }
    }
    
    
    

    public static void startSqlSession() {
        localSqlSession.set(sqlSessionFactory.openSession());
    }
    
    public static SqlSession getSqlSession() {
        final SqlSession sqlSession = localSqlSession.get();
        if(sqlSession == null) {
            throw new SqlSessionException("sqlSession未创建");
        }
        return sqlSession;
    }

    public static void commit() {
        final SqlSession sqlSession = localSqlSession.get();
        if(sqlSession == null) {
            throw new SqlSessionException("sqlSession未创建");
        }
        sqlSession.commit();
    }

    public void rollback() {
        final SqlSession sqlSession = localSqlSession.get();
        if(sqlSession == null) {
            throw new SqlSessionException("sqlSession未创建");
        }
        sqlSession.rollback();
    }

    public static void close() {
        final SqlSession sqlSession = localSqlSession.get();
        if(sqlSession == null) {
            throw new SqlSessionException("sqlSession未创建");
        }
        try {
            sqlSession.close();
        } finally {
            localSqlSession.remove();
        }
    }
    
    public static <T> T getMapper(Class<T> type) {
        final SqlSession sqlSession = localSqlSession.get();
        if(sqlSession == null) {
            throw new SqlSessionException("sqlSession未创建");
        }
        return sqlSession.getMapper(type);
    }
}

class SqlSessionFactoryUtils {
    
}
