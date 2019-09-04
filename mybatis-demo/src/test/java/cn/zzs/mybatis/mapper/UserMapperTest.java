package cn.zzs.mybatis.mapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.zzs.mybatis.pojo.User;
import cn.zzs.mybatis.pojo.UserExample;
import cn.zzs.mybatis.pojo.UserExample.Criteria;

/**
 * @ClassName: UserMapperTest
 * @Description: 测试UserMapper
 * @author: zzs
 * @date: 2019年9月2日 上午11:59:11
 */
public class UserMapperTest {
	private UserMapper userMapper;

	private SqlSessionFactory sqlSessionFactory;
	private SqlSession sqlSession;
	private static Logger logger = LoggerFactory.getLogger(UserMapperTest.class);

	/**
	 * 测试添加
	 */
	@Test
	public void testSave() {
		//开启事务:sqlSession获取时已经设置了手动提交
		try {
			//创建用户
			User user = new User(18, new Date(), new Date(), "zzs005");
			//设置角色
			user.setRoleId(1L);
			//保存
			userMapper.insert(user);
			//userMapper.insertSelective(new User(18, new Date(), new Date(), "zzs001"));
			//提交事务
			sqlSession.commit();
		} catch (Exception e) {
			logger.error("操作失败，事务回滚", e);
			sqlSession.rollback();
		}
	}

	/**
	 * 
	 * @Title: testUpdate
	 * @Description: 测试根据id查询并更新
	 * @author: zzs
	 * @date: 2019年9月3日 下午9:23:14
	 * @return: void
	 */
	@Test
	public void testUpdate() {
		//开启事务:sqlSession获取时已经设置了手动提交
		try {
			//根据id查询
			User user = userMapper.selectByPrimaryKey(1L);
			//更新
			user.setAge(20);
			user.setRoleId(2L);
			user.setModified(new Date());
			user.setCreate(null);
			//userMapper.updateByPrimaryKey(user);
			userMapper.updateByPrimaryKeySelective(user);
			//提交事务
			sqlSession.commit();
		} catch (Exception e) {
			logger.error("操作失败，事务回滚", e);
			sqlSession.rollback();
		}
	}

	/**
	 * 测试删除
	 */
	@Test
	public void testDelete() {
		try {
			//删除
			userMapper.deleteByPrimaryKey(1L);
			//提交事务
			sqlSession.commit();
		} catch (Exception e) {
			logger.error("操作失败，事务回滚", e);
			sqlSession.rollback();
		}
	}

	/**
	 * 测试Examper
	 */
	@Test
	public void testExample() {
		try {
			UserExample example = new UserExample();
			//设置查询条件一
			//Criteria criteria = userExample.createCriteria();//and
			Criteria criteria = example.or();//or
			criteria.andNameLike("zzs%");
			//设置查询条件二:or条件的查询
			Criteria criteria2 = example.or();
			criteria2.andNameLike("zzf%");
			//设置去重复
			example.setDistinct(true);
			//设置排序规则
			example.setOrderByClause("user_age");//注意为数据库字段
			//执行,并遍历结果集
			List<User> list = userMapper.selectByExample(example);
			Iterator<User> iterator = list.iterator();
			while (iterator.hasNext()) {
				System.err.println(iterator.next());
			}
			//提交事务
			sqlSession.commit();
		} catch (Exception e) {
			logger.error("操作失败，事务回滚", e);
			sqlSession.rollback();
		}
	}

	/**
	 * 测试根据id查询用户并查询角色
	 */
	@Test
	public void testSelectRelatedRoleByPrimaryKey() {
		try {
			//执行查询,并遍历结果集
			List<User> list = userMapper.selectRelatedRoleByPrimaryKey(2L);
			Iterator<User> iterator = list.iterator();
			while (iterator.hasNext()) {
				User user = iterator.next();
				System.err.println(user);
				System.err.println(user.getRole());
			}
			//提交事务
			sqlSession.commit();
		} catch (Exception e) {
			logger.error("操作失败，事务回滚", e);
			sqlSession.rollback();
		}
	}

	/**
	 * 测试根据条件查询用户并查询角色
	 */
	@Test
	public void testselectRelatedRoleByExample() {
		try {
			UserExample example = new UserExample();
			//设置查询条件一
			//Criteria criteria = example.createCriteria();//and
			Criteria criteria = example.or();//or
			criteria.andNameLike("zzs%");
			//设置查询条件二:or条件的查询
			Criteria criteria2 = example.or();
			criteria2.andNameLike("zzf%");
			//设置去重复
			example.setDistinct(true);
			//设置排序规则
			example.setOrderByClause("user_age");//注意为数据库字段
			//执行,并遍历结果集
			List<User> list = userMapper.selectRelatedRoleByExample(example);
			Iterator<User> iterator = list.iterator();
			while (iterator.hasNext()) {
				User user = iterator.next();
				System.err.println(user);
				System.err.println(user.getRole());
			}
			//提交事务
			sqlSession.commit();
		} catch (Exception e) {
			logger.error("操作失败，事务回滚", e);
			sqlSession.rollback();
		}
	}

	/**
	 * 测试分页插件
	 */
	@Test
	public void testPageHelper() {
		//设置分页信息
		PageHelper.startPage(0, 3);
		//执行查询
		List<User> list = userMapper.selectByExample(null);
		//遍历结果
		Iterator<User> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.err.println(iterator.next());
		}
		//封装分页模型
		PageInfo<User> pageInfo = new PageInfo<>(list);
		//取分页模型的数据
		System.err.println("查询总数" + pageInfo.getTotal());
	}

	/**
	 * 
	 * 初始化
	 */
	@Before
	public void init() {
		// 创建SqlSessionFactoryBuilder对象
		SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
		InputStream inputStream = null;
		try {
			// 查找配置文件创建输入流
			inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			// 加载配置文件，创建SqlSessionFactory对象
			sqlSessionFactory = sfb.build(inputStream);
			//获取SqlSession对象。注意，这个对象不是线程安全的。
			sqlSession = sqlSessionFactory.openSession(false);
			//初始化Mapper
			userMapper = sqlSession.getMapper(UserMapper.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@After
	public void destroy() {
		//归还连接
		if (sqlSession != null) {
			sqlSession.close();
		}
	}
}
