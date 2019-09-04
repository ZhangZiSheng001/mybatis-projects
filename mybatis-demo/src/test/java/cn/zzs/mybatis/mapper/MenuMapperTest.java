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
import cn.zzs.mybatis.pojo.MenuExample.Criteria;

/**
 * @ClassName: MenuMapperTest
 * @Description: 测试MenuMapper
 * @author: zzs
 * @date: 2019年9月2日 上午11:59:11
 */
public class MenuMapperTest {
	private MenuMapper menuMapper;

	private SqlSessionFactory sqlSessionFactory;
	private SqlSession sqlSession;
	private static Logger logger = LoggerFactory.getLogger(MenuMapperTest.class);

	/**
	 * 测试添加
	 */
	@Test
	public void testSave() {
		//开启事务:sqlSession获取时已经设置了手动提交
		try {
			//保存
			//menuMapper.insert(new Menu(new Date(), new Date(), "系统菜单", 0, null, null));
			//查询父菜单
			MenuExample example = new MenuExample();
			example.createCriteria().andNameEqualTo("系统菜单");
			List<Menu> list = menuMapper.selectByExample(example);
			//创建菜单并设置父菜单
			Menu menu = new Menu(new Date(), new Date(), "基本管理", 0, "http://",null );
			if(list != null && list.size()!= 0) {
				menu.setParentId(list.get(0).getId());
				menuMapper.insert(menu);
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
	 * @Description: 测试根据名称查询并更新
	 * @author: zzs
	 * @date: 2019年9月3日 下午9:23:14
	 * @return: void
	 */
	@Test
	public void testUpdate() {
		//开启事务:sqlSession获取时已经设置了手动提交
		try {
			//设置条件
			MenuExample example = new MenuExample();
			example.createCriteria().andNameEqualTo("销售订单查询");
			//查询
			List<Menu> list = menuMapper.selectByExample(example);
			if (list != null && list.size() != 0) {
				Menu menu = list.get(0);
				//更新
				menu.setUrl("http://sale");
				menu.setModified(new Date());
				menu.setCreate(null);
				//menuMapper.updateByPrimaryKey(menu);
				menuMapper.updateByPrimaryKeySelective(menu);
			}
			//提交事务
			sqlSession.commit();
		} catch (Exception e) {
			logger.error("操作失败，事务回滚", e);
			sqlSession.rollback();
		}
	}
	
	/**
	 * 测试根据id查询菜单并查询角色
	 */
	@Test
	public void testSelectRelatedRoleByPrimaryKey() {
		try {
			//定义id
			String id = "005904abce6711e9898d026659304366";
			//执行查询,并遍历结果集
			List<Menu> list = menuMapper.selectRelatedRoleByPrimaryKey(id);
			Iterator<Menu> iterator = list.iterator();
			while (iterator.hasNext()) {
				Menu menu = iterator.next();
				System.err.println(menu);
				System.err.println(menu.getRoles());
			}
			//提交事务
			sqlSession.commit();
		} catch (Exception e) {
			logger.error("操作失败，事务回滚", e);
			sqlSession.rollback();
		}
	}

	/**
	 * 测试根据Example查询菜单并查询角色
	 */
	@Test
	public void testselectRelatedRoleByExample() {
		try {
			MenuExample example = new MenuExample();
			//设置查询条件
			Criteria criteria = example.createCriteria();
			criteria.andNameLike("销售%");
			//设置排序规则
			example.setOrderByClause("menu_order");//注意为数据库字段
			//执行,并遍历结果集
			List<Menu> list = menuMapper.selectRelatedRoleByExample(example);
			Iterator<Menu> iterator = list.iterator();
			while (iterator.hasNext()) {
				Menu menu = iterator.next();
				System.err.println(menu);
				System.err.println(menu.getRoles());
			}
			//提交事务
			sqlSession.commit();
		} catch (Exception e) {
			logger.error("操作失败，事务回滚", e);
			sqlSession.rollback();
		}
	}
	/**
	 * 测试查询菜单树
	 */
	@Test
	public void testSelectRootRelatedChildren() {
		try {
			//执行,并遍历结果集
			Menu menu = menuMapper.selectRootRelatedChildren();
			//遍历菜单树
			ShowTree(menu);
			//提交事务
			sqlSession.commit();
		} catch (Exception e) {
			logger.error("操作失败，事务回滚", e);
			sqlSession.rollback();
		}
	}
	
	/**
	 * 遍历菜单树
	 */
	public void ShowTree(Menu menu) {
		//打印当前菜单
		System.err.println(menu);
		//执行,并遍历结果集
		List<Menu> list = menu.getChildren();
		//遍历菜单树
		if(list==null) {
			return;
		}
		Iterator<Menu> iterator = list.iterator();
		while (iterator.hasNext()) {
			ShowTree(iterator.next());
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
