package cn.zzs.mybatis.repository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.zzs.mybatis.condition.EmployeeCondition;
import cn.zzs.mybatis.entity.Employee;
import cn.zzs.mybatis.repository.impl.EmployeeRepository;
import cn.zzs.mybatis.util.MybatisUtils;

/**
 * <p>测试EmployeeRepository</p>
 * @author: zzs
 * @date: 2020年3月30日 下午3:42:17
 */
public class EmployeeRepositoryTest {

    private IEmployeeRepository employeeRepository = new EmployeeRepository();

    /**
     * Test method for {@link cn.zzs.mybatis.repository.IEmployeeRepository#get(java.lang.String)}.
     */
    @Test
    public void testGet() {
        String id = "cc6b08506cdb11ea802000fffc35d9fe";

        try (SqlSession sqlSession = MybatisUtils.getSqlSession();) {

            // 执行，获取员工对象
            Employee employee = employeeRepository.get(id);

            // 打印
            System.out.println(employee);
        }
    }

    /**
     * Test method for {@link cn.zzs.mybatis.repository.IEmployeeRepository#list(cn.zzs.mybatis.condition.EmployeeCondition)}.
     */
    @Test
    public void testList() {
        EmployeeCondition con = new EmployeeCondition();
        // 设置条件
        con.setGender(false);
        con.setAddress("北京");
        con.setDeleted(false);
        con.setPhone("18826****41");
        con.setDistinct(true);
        con.setDepartmentNo("202003230002");

        // 设置排序规则
        con.setOrderByClause("name desc");// 注意为数据库字段

        try (SqlSession sqlSession = MybatisUtils.getSqlSession()) {

            // 执行
            List<Employee> list = employeeRepository.list(con);

            // 遍历结果
            list.forEach(System.out::println);
        }
    }

    /**
     * Test method for {@link cn.zzs.mybatis.repository.IEmployeeRepository#count(cn.zzs.mybatis.condition.EmployeeCondition)}.
     */
    @Test
    public void testCount() {
        EmployeeCondition con = new EmployeeCondition();
        // 设置条件
        con.setGender(false);
        con.setAddress("北京");
        con.setDeleted(false);
        con.setPhone("18826****41");
        con.setDistinct(true);

        // 设置排序规则
        con.setOrderByClause("name desc");// 注意为数据库字段

        try (SqlSession sqlSession = MybatisUtils.getSqlSession()) {

            // 执行
            long count = employeeRepository.count(con);

            // 遍历结果
            System.out.println(count);
        }
    }

    /**
     * Test method for {@link cn.zzs.mybatis.repository.IEmployeeRepository#delete(java.lang.String)}.
     */
    @Test
    public void testDeleteString() {
        String id = "bf3a05313c1a452ea03e0139d4f65ed5";

        try (SqlSession sqlSession = MybatisUtils.getSqlSession()) {

            // 删除
            employeeRepository.delete(id);

            // 提交事务
            sqlSession.commit();
        }
    }

    /**
     * Test method for {@link cn.zzs.mybatis.repository.IEmployeeRepository#save(cn.zzs.mybatis.entity.Employee)}.
     */
    @Test
    public void testSave() {
        // 创建用户
        Employee employee = new Employee(UUID.randomUUID().toString().replace("-", ""), "zzs005", true, "zzs005", "admin", "18826****41", "广东", (byte)1, false, "94e2d2e56cd811ea802000fffc35d9fa", new Date(), new Date());
        try (SqlSession sqlSession = MybatisUtils.getSqlSession()) {

            // 保存
            employeeRepository.save(employee);

            // 提交事务
            sqlSession.commit();
        }
    }

    /**
     * Test method for {@link cn.zzs.mybatis.repository.IEmployeeRepository#updateSelective(cn.zzs.mybatis.entity.Employee)}.
     */
    @Test
    public void testUpdateEmployee() {
        String id = "cc6b08506cdb11ea802000fffc35d9fa";
        try (SqlSession sqlSession = MybatisUtils.getSqlSession()) {

            // 根据id查询
            Employee employee = employeeRepository.get(id);
            employee.setAddress("北京");
            employee.setPassword("666666");
            employee.setModified(new Date());

            // 更新
            employeeRepository.update(employee);

            // 提交事务
            sqlSession.commit();
        }
    }

    /**
     * Test method for {@link cn.zzs.mybatis.repository.IEmployeeRepository#get(java.lang.String)}.
     */
    @Test
    public void testGetLazy() {
        String id = "cc6b08506cdb11ea802000fffc35d9fe";

        try (SqlSession sqlSession = MybatisUtils.getSqlSession()) {

            // 执行，获取员工对象
            Employee employee = employeeRepository.get(id);

            // 打印员工
            System.out.println(employee);
            // 打印部门
            System.out.println(employee.getDepartment());
            // 打印角色
            // employee.getRoles().forEach(System.out::println);
            // 打印菜单
            // employee.getMenus().forEach(System.out::println);

        }
    }

    /**
     * 测试分页插件
     */
    @Test
    public void testlistPage() {
        EmployeeCondition con = new EmployeeCondition();
        // 设置条件
        con.setGender(false);
        con.setAddress("北京");
        con.setDeleted(false);
        con.setPhone("18826****41");
        con.setDistinct(true);

        try (SqlSession sqlSession = MybatisUtils.getSqlSession()) {
            // 设置分页信息
            PageHelper.startPage(0, 3);

            // 执行查询
            List<Employee> list = employeeRepository.list(con);
            // 遍历结果
            list.forEach(System.out::println);

            // 封装分页模型
            PageInfo<Employee> pageInfo = new PageInfo<>(list);

            // 取分页模型的数据
            System.out.println("查询总数" + pageInfo.getTotal());
        }
    }
}
