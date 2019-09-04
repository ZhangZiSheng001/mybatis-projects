package cn.zzs.mybatis.mapper;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import cn.zzs.mybatis.Application;
import cn.zzs.mybatis.pojo.Menu;
import cn.zzs.mybatis.pojo.MenuExample;
import cn.zzs.mybatis.pojo.MenuExample.Criteria;

/**
 * @ClassName: MenuMapperTest
 * @Description: 测试MenuMapper
 * @author: zzs
 * @date: 2019年9月2日 上午11:59:11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { Application.class })
public class MenuMapperTest {
	@Autowired
	private MenuMapper menuMapper;

	/**
	 * 测试添加
	 */
	@Test
	@Transactional
	@Rollback(false)
	public void testSave() {
		//保存
		//menuMapper.insert(new Menu(new Date(), new Date(), "系统菜单", 0, null, null));
		//查询父菜单
		MenuExample example = new MenuExample();
		example.createCriteria().andNameEqualTo("系统菜单");
		List<Menu> list = menuMapper.selectByExample(example);
		//创建菜单并设置父菜单
		Menu menu = new Menu(new Date(), new Date(), "数据分析", 0, "http://", null);
		if (list != null && list.size() != 0) {
			menu.setParentId(list.get(0).getId());
			menuMapper.insert(menu);
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
	@Transactional
	@Rollback(false)
	public void testUpdate() {
		//开启事务:sqlSession获取时已经设置了手动提交
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
	}

	/**
	 * 测试根据id查询菜单并查询角色
	 */
	@Test
	@Transactional(readOnly = true)
	@Rollback(false)
	public void testSelectRelatedRoleByPrimaryKey() {
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
	}

	/**
	 * 测试根据Example查询菜单并查询角色
	 */
	@Test
	@Transactional(readOnly = true)
	@Rollback(false)
	public void testselectRelatedRoleByExample() {
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
	}

	/**
	 * 测试查询菜单树
	 */
	@Test
	@Transactional(readOnly = true)
	@Rollback(false)
	public void testSelectRootRelatedChildren() {
		//执行,并遍历结果集
		Menu menu = menuMapper.selectRootRelatedChildren();
		//遍历菜单树
		ShowTree(menu);
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
		if (list == null) {
			return;
		}
		Iterator<Menu> iterator = list.iterator();
		while (iterator.hasNext()) {
			ShowTree(iterator.next());
		}
	}

}
