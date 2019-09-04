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

import cn.zzs.mybatis.pojo.Menu;
import cn.zzs.mybatis.pojo.MenuExample;
import cn.zzs.mybatis.pojo.Role;
import cn.zzs.mybatis.pojo.RoleExample;
import cn.zzs.mybatis.pojo.RoleExample.Criteria;

/**
 * @ClassName: RoleMapperTest
 * @Description: 测试RoleMapper
 * @author: zzs
 * @date: 2019年9月2日 上午11:59:11
 */
public class RoleMapperTest {
	private RoleMapper roleMapper;
	private MenuMapper menuMapper;

	private SqlSessionFactory sqlSessionFactory;
	private SqlSession sqlSession;
	private static Logger logger = LoggerFactory.getLogger(RoleMapperTest.class);

	/**
	 * 测试添加
	 */
	@Test
	public void testSave() {
		//开启事务:sqlSession获取时已经设置了手动提交
		try {
			//创建角色并保存
			Role role = new Role(new Date(), new Date(), "仓库主管");
			roleMapper.insert(role);
			//设置权限菜单
			MenuExample example = new MenuExample();
			example.createCriteria().andNameLike("%库");
			List<Menu> list = menuMapper.selectByExample(example);
			if (list != null && list.size() != 0) {
				for (Menu menu : list) {
					//执行设置菜单
					System.err.println(role.getId());
					roleMapper.setMenuByPrimaryKey(role.getId(), menu.getId());
				}
			}
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
			Role role = roleMapper.selectByPrimaryKey(1L);
			//更新
			role.setModified(new Date());
			role.setCreate(null);
			//roleMapper.updateByPrimaryKey(role);
			roleMapper.updateByPrimaryKeySelective(role);
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
			roleMapper.deleteByPrimaryKey(1L);
			//提交事务
			sqlSession.commit();
		} catch (Exception e) {
			logger.error("操作失败，事务回滚", e);
			sqlSession.rollback();
		}
	}

	/**
	 * 测试根据id查询角色并查询用户
	 */
	@Test
	public void testSelectRelatedUserByPrimaryKey() {
		try {
			//执行查询,并遍历结果集
			List<Role> list = roleMapper.selectRelatedUserByPrimaryKey(1L);
			Iterator<Role> iterator = list.iterator();
			while (iterator.hasNext()) {
				Role role = iterator.next();
				System.err.println(role);
				System.err.println(role.getUsers());
			}
			//提交事务
			sqlSession.commit();
		} catch (Exception e) {
			logger.error("操作失败，事务回滚", e);
			sqlSession.rollback();
		}
	}

	/**
	 * 测试根据条件查询角色并查询用户
	 */
	@Test
	public void testselectRelatedUserByExample() {
		try {
			RoleExample example = new RoleExample();
			//设置查询条件
			Criteria criteria = example.createCriteria();//and
			//Criteria criteria = example.or();//or
			criteria.andNameLike("销售%");
			//设置去重复
			example.setDistinct(true);
			//设置排序规则
			example.setOrderByClause("gmt_create");//注意为数据库字段
			//执行,并遍历结果集
			List<Role> list = roleMapper.selectRelatedUserByExample(example);
			Iterator<Role> iterator = list.iterator();
			while (iterator.hasNext()) {
				Role role = iterator.next();
				System.err.println(role);
				System.err.println(role.getUsers());
			}
			//提交事务
			sqlSession.commit();
		} catch (Exception e) {
			logger.error("操作失败，事务回滚", e);
			sqlSession.rollback();
		}
	}

	/**
	 * 测试根据id查询角色并查询菜单
	 */
	@Test
	public void testSelectRelatedMenuByPrimaryKey() {
		try {
			//执行查询,并遍历结果集
			List<Role> list = roleMapper.selectRelatedMenuByPrimaryKey(1L);
			Iterator<Role> iterator = list.iterator();
			while (iterator.hasNext()) {
				Role role = iterator.next();
				System.err.println(role);
				System.err.println(role.getMenus());
			}
			//提交事务
			sqlSession.commit();
		} catch (Exception e) {
			logger.error("操作失败，事务回滚", e);
			sqlSession.rollback();
		}
	}

	/**
	 * 测试根据条件查询角色并查询菜单
	 */
	@Test
	public void testselectRelatedMenuByExample() {
		try {
			RoleExample example = new RoleExample();
			//设置查询条件
			Criteria criteria = example.createCriteria();//and
			//Criteria criteria = example.or();//or
			criteria.andNameLike("销售%");
			//设置去重复
			example.setDistinct(true);
			//设置排序规则
			example.setOrderByClause("gmt_create");//注意为数据库字段
			//执行,并遍历结果集
			List<Role> list = roleMapper.selectRelatedMenuByExample(example);
			Iterator<Role> iterator = list.iterator();
			while (iterator.hasNext()) {
				Role role = iterator.next();
				System.err.println(role);
				System.err.println(role.getMenus());
			}
			//提交事务
			sqlSession.commit();
		} catch (Exception e) {
			logger.error("操作失败，事务回滚", e);
			sqlSession.rollback();
		}
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
			roleMapper = sqlSession.getMapper(RoleMapper.class);
			menuMapper = sqlSession.getMapper(MenuMapper.class);
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
