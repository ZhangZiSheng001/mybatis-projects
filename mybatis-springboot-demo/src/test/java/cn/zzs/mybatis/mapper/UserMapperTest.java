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

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.zzs.mybatis.Application;
import cn.zzs.mybatis.pojo.User;
import cn.zzs.mybatis.pojo.UserExample;
import cn.zzs.mybatis.pojo.UserExample.Criteria;

/**
 * @ClassName: UserMapperTest
 * @Description: 测试UserMapper
 * @author: zzs
 * @date: 2019年9月2日 上午11:59:11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { Application.class })
public class UserMapperTest {
	@Autowired
	private UserMapper userMapper;

	/**
	 * 测试添加
	 */
	@Test
	@Transactional
	@Rollback(false)
	public void testSave() {
		//创建用户
		User user = new User(18, new Date(), new Date(), "zzf006");
		//设置角色
		user.setRoleId(1L);
		//保存
		userMapper.insert(user);
		//userMapper.insertSelective(new User(18, new Date(), new Date(), "zzs001"));
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
		User user = userMapper.selectByPrimaryKey(3L);
		//更新
		user.setAge(20);
		user.setRoleId(2L);
		user.setModified(new Date());
		user.setCreate(null);
		//userMapper.updateByPrimaryKey(user);
		userMapper.updateByPrimaryKeySelective(user);
	}

	/**
	 * 测试删除
	 */
	@Test
	@Transactional
	@Rollback(false)
	public void testDelete() {
		//删除
		userMapper.deleteByPrimaryKey(1L);
	}

	/**
	 * 测试Examper
	 */
	@Test
	@Transactional(readOnly = true)
	@Rollback(false)
	public void testExample() {
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
	}

	/**
	 * 测试根据id查询用户并查询角色
	 */
	@Test
	@Transactional(readOnly = true)
	@Rollback(false)
	public void testSelectRelatedRoleByPrimaryKey() {
		//执行查询,并遍历结果集
		List<User> list = userMapper.selectRelatedRoleByPrimaryKey(2L);
		Iterator<User> iterator = list.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			System.err.println(user);
			System.err.println(user.getRole());
		}
	}

	/**
	 * 测试根据条件查询用户并查询角色
	 */
	@Test
	@Transactional(readOnly = true)
	@Rollback(false)
	public void testselectRelatedRoleByExample() {
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
	}

	/**
	 * 测试分页插件
	 */
	@Test
	@Transactional(readOnly = true)
	@Rollback(false)	
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
}
