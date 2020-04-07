package cn.zzs.mybatis.repository;

import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.zzs.mybatis.condition.EmployeeCondition;
import cn.zzs.mybatis.entity.Employee;
import cn.zzs.mybatis.mapper.EmployeeMapper;
import cn.zzs.mybatis.repository.impl.EmployeeRepository;
import cn.zzs.mybatis.util.MybatisUtils;

/**
 * <p>测试EmployeeRepository</p>
 * @author: zzs
 * @date: 2020年3月30日 下午3:42:17
 */
public class EmployeeRepositoryTest {

    private IEmployeeRepository employeeRepository = new EmployeeRepository();
    
    @Before
    public void startSqlSession() {
        MybatisUtils.startSqlSession();
    }
    
    @After
    public void endSqlSession() {
        MybatisUtils.close();
    }

    /**
     * <p>测试根据id查询</p>
     */
    @Test
    public void testGet() {
        String id = "cc6b08506cdb11ea802000fffc35d9fe";

        // 执行，获取员工对象
        Employee employee = employeeRepository.get(id);

        // 打印
        System.out.println(employee);
    }

    /**
     * <p>测试高级条件查询--嵌套select查询</p>
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
        con.setOrderByClause("e.name desc");// 注意为数据库字段


        // 执行
        List<Employee> list = employeeRepository.list(con);

        // 遍历结果
        list.forEach(x -> {
            System.out.println(x);
            System.out.println(x.getDepartment());
            System.out.println(x.getRoles());
        });
    }
    
    
    /**
     * <p>测试高级条件查询--嵌套结果查询</p>
     */
    @Test
    public void testList2() {
        EmployeeCondition con = new EmployeeCondition();
        // 设置条件
        con.setGender(false);
        con.setAddress("北京");
        con.setDeleted(false);
        con.setPhone("18826****41");
        con.setDistinct(true);
        //con.setDepartmentNo("202003230002");
        con.setJoinDepartment(true);

        // 设置排序规则
        con.setOrderByClause("e.name desc");// 注意为数据库字段


        // 执行
        List<Employee> list = employeeRepository.list2(con);

        // 遍历结果
        list.forEach(x -> {
            System.out.println(x);
            System.out.println(x.getDepartment());
        });
    }


    /**
     * <p>测试高级条件查询--查询数量</p>
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

        // 执行
        long count = employeeRepository.count(con);

        // 遍历结果
        System.out.println(count);
    }

    /**
     * <p>测试删除</p>
     */
    @Test
    public void testDeleteString() {
        String id = "517cabff75b24129b54048ce7d3280f9";


        // 删除
        employeeRepository.delete(id);

        // 提交事务
        MybatisUtils.commit();
    }

    /**
     * <p>测试保存</p>
     */
    @Test
    public void testSave() {
        // 创建用户
        Employee employee = new Employee(UUID.randomUUID().toString().replace("-", ""), "zzs005", true, "zzs005", "admin", "18826****41", "广东", (byte)1, false, "94e2d2e56cd811ea802000fffc35d9fa", new Date(), new Date());

        // 保存
        employeeRepository.save(employee);

        // 提交事务
        MybatisUtils.commit();
    }

    /**
     * <p>测试更新</p>
     */
    @Test
    public void testUpdateEmployee() {
        String id = "cc6b08506cdb11ea802000fffc35d9fa";

        // 根据id查询
        Employee employee = employeeRepository.get(id);
        employee.setAddress("北京");
        employee.setPassword("666666");
        employee.setModified(new Date());

        // 更新
        employeeRepository.update(employee);

        // 提交事务
        MybatisUtils.commit();
    }

    /**
     * <p>测试懒加载触发</p>
     */
    @Test
    public void testGetLazy() {
        // 设置输出代理类到指定路径
        // -Dcglib.debugLocation=D:/growUp/test
        String id = "cc6b08506cdb11ea802000fffc35d9fe";

        // 执行，获取员工对象
        Employee employee = employeeRepository.get(id);
        System.out.println("================");
        
        // 打印员工
        System.out.println(employee.toString());
        // 打印部门
        System.out.println(employee.getDepartment());
        // 打印角色
        // employee.getRoles().forEach(System.out::println);
        // 打印菜单
        // employee.getMenus().forEach(System.out::println);

    }

    /**
     * <p>测试分页插件</p>
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
    
    /**
     *<p>测试SqlSessionManager</p>
     */
    @Test
    public void testGet02() throws Exception {
        Employee employee = new Employee(UUID.randomUUID().toString().replace("-", ""), "zzs005", true, 
                "zzs005", "admin", "18826****41", 
                "广东", (byte)1, false, 
                "94e2d2e56cd811ea802000fffc35d9fa", new Date(), new Date());
        try (InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml"); 
                SqlSessionManager sqlSessionManager = SqlSessionManager.newInstance(inputStream);) {
            // 加载配置文件

            // 创建sqlSession
            sqlSessionManager.startManagedSession();

            // 执行，获取员工对象
            sqlSessionManager.getMapper(EmployeeMapper.class).insert(employee);

            // 打印
            sqlSessionManager.commit();
        }
    }
}
