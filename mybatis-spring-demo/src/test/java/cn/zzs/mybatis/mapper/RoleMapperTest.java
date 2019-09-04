package cn.zzs.mybatis.mapper;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

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
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class RoleMapperTest {
	@Autowired
	private RoleMapper roleMapper;
	@Autowired
	private MenuMapper menuMapper;

	/**
	 * 测试添加
	 */
	@Test
	@Transactional
	@Rollback(false)
	public void testSave() {
		//创建角色并保存
		Role role = new Role(new Date(), new Date(), "库管员");
		roleMapper.insert(role);
		//设置权限菜单
		MenuExample example = new MenuExample();
		example.createCriteria().andNameLike("%库");
		List<Menu> list = menuMapper.selectByExample(example);
		if (list != null && list.size() != 0) {
			for (Menu menu : list) {
				//执行设置菜单
				roleMapper.setMenuByPrimaryKey(role.getId(), menu.getId());
			}
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
	@Transactional
	@Rollback(false)
	public void testUpdate() {
		//根据id查询
		Role role = roleMapper.selectByPrimaryKey(2L);
		//更新
		role.setModified(new Date());
		role.setCreate(null);
		//roleMapper.updateByPrimaryKey(role);
		roleMapper.updateByPrimaryKeySelective(role);
	}

	/**
	 * 测试删除
	 */
	@Test
	@Transactional
	@Rollback(false)
	public void testDelete() {
		//删除
		roleMapper.deleteByPrimaryKey(1L);
	}

	/**
	 * 测试根据id查询角色并查询用户
	 */
	@Test
	@Transactional(readOnly = true)
	@Rollback(false)
	public void testSelectRelatedUserByPrimaryKey() {
		//执行查询,并遍历结果集
		List<Role> list = roleMapper.selectRelatedUserByPrimaryKey(1L);
		Iterator<Role> iterator = list.iterator();
		while (iterator.hasNext()) {
			Role role = iterator.next();
			System.err.println(role);
			System.err.println(role.getUsers());
		}
	}

	/**
	 * 测试根据条件查询角色并查询用户
	 */
	@Test
	@Transactional(readOnly = true)
	@Rollback(false)
	public void testselectRelatedUserByExample() {
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
	}

	/**
	 * 测试根据id查询角色并查询菜单
	 */
	@Test
	@Transactional(readOnly = true)
	@Rollback(false)
	public void testSelectRelatedMenuByPrimaryKey() {
		//执行查询,并遍历结果集
		List<Role> list = roleMapper.selectRelatedMenuByPrimaryKey(1L);
		Iterator<Role> iterator = list.iterator();
		while (iterator.hasNext()) {
			Role role = iterator.next();
			System.err.println(role);
			System.err.println(role.getMenus());
		}
	}

	/**
	 * 测试根据条件查询角色并查询菜单
	 */
	@Test
	@Transactional(readOnly = true)
	@Rollback(false)
	public void testselectRelatedMenuByExample() {
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
	}
}
