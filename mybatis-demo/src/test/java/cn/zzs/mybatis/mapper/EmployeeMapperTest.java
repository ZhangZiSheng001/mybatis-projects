package cn.zzs.mybatis.mapper;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.zzs.mybatis.condition.EmployeeCondition;
import cn.zzs.mybatis.entity.Department;
import cn.zzs.mybatis.entity.Employee;
import cn.zzs.mybatis.vo.EmployeeVO;
import cn.zzs.mybatis.vo.EmployeeVOResultHandler;

/**
 * <p>测试EmployeeRepository</p>
 * @author: zzs
 * @date: 2020年3月30日 下午3:42:17
 */
public class EmployeeMapperTest {
    
    
    private SqlSession sqlSession;
    
    private EmployeeMapper employeeMapper;
    
    @Resource
    private DepartmentMapper departmentMapper;
    
    @Before
    public void setUp() throws IOException {
        // 加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        
        // 第一种获取SqlSession方法：同一线程每次获取都是同一个sqlSession
        SqlSessionManager sqlSessionManager = SqlSessionManager.newInstance(inputStream);
        sqlSession = sqlSessionManager.openSession();
        
        // 第二种获取SqlSession方法：同一线程每次获取都是不同的sqlSession
        /*SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();*/
        
        employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        departmentMapper = sqlSession.getMapper(DepartmentMapper.class);
    }
    
    @After
    public void tearDown() {
        // 释放资源
        sqlSession.close();
    }
    
    /**
     * 入门例子
     */
    @Test
    public void testSample() {
        // 执行查询
        List<Employee> employees = employeeMapper.queryListByNameAndGenderAndPhone("zzs001", 1, "18826****42");
        
        // 测试
        assertTrue(!CollectionUtils.isEmpty(employees));
        employees.stream().forEach(System.err::println);
        
    }
    
    /**
     * 高级条件查询
     */
    @Test
    public void testQueryByCondition() {
        // 构建条件
        EmployeeCondition con = new EmployeeCondition();
        con.setName("zzs001");
        con.setDeleted(0);
        con.setCreateStart(new Date(1546272000000L));// 2019-01-01 00:00:00.0
        con.setPhoneInclude(Arrays.asList("18826****41", "18826****42"));
        
        // 执行查询
        List<Employee> employees = employeeMapper.queryByCondition(con);
        
        // 测试
        assertTrue(!CollectionUtils.isEmpty(employees));
        employees.stream().forEach(System.err::println);
    }
    
    /**
     * 多表查询1
     */
    @Test
    public void testMultiTableQuery1() throws Exception {
        // 先查员工
        Employee employee = employeeMapper.queryById("cc6b08506cdb11ea802000fffc35d9fe");
        
        // 再查部门
        Department department = departmentMapper.queryById(employee.getDepartmentId());
        
        // 组装数据
        EmployeeVO employeeVO = new EmployeeVO();
        BeanUtils.copyProperties(employeeVO, employee);
        employeeVO.setDepartmentName(department.getName());
        employeeVO.setDepartmentNo(department.getNo());
        
        // 测试
        System.err.println(employeeVO);
    }
    
    /**
     * 多表查询2
     */
    @Test
    public void testMultiTableQuery2() throws Exception {
        // 先查员工
        Employee employee = employeeMapper.queryById("cc6b08506cdb11ea802000fffc35d9fe");
        
        // 取出部门对象
        Department department = employee.getDepartment();
        
        // 组装数据
        EmployeeVO employeeVO = new EmployeeVO();
        BeanUtils.copyProperties(employeeVO, employee);
        employeeVO.setDepartmentName(department.getName());
        employeeVO.setDepartmentNo(department.getNo());
        
        // 测试
        System.err.println(employeeVO);
    }
    
    /**
     * 多表查询3
     */
    @Test
    public void testMultiTableQuery3() {
        // 执行查询
        EmployeeVO employeeVO = employeeMapper.queryVOById("cc6b08506cdb11ea802000fffc35d9fe");
        
        // 测试
        System.err.println(employeeVO);
    }
    
    /**
     * 分页查询
     */    
    @Test
    public void testPageQuery() {
        // 构建条件
        EmployeeCondition con = new EmployeeCondition();
        con.setDeleted(0);

        // 设置分页信息
        PageHelper.startPage(0, 3);
        
        // 执行查询
        List<Employee> employees = employeeMapper.queryByCondition(con);
        
        // 遍历结果
        employees.forEach(System.err::println);
        
        List<Employee> employees2 = employeeMapper.queryByCondition(con);
        employees2.forEach(System.err::println);

        // 封装分页模型
        PageInfo<Employee> pageInfo = new PageInfo<>(employees);

        // 取分页模型的数据
        System.err.println("结果总数:" + pageInfo.getTotal());
    }
    
    /**
     * ResultHandler
     */
    @Test
    public void testResultHandler() {
        // 创建ResultHandler
        EmployeeVOResultHandler resultHandler = new EmployeeVOResultHandler();
        
        // 构建条件
        EmployeeCondition con = new EmployeeCondition();
        con.setDeleted(0);
        
        // 执行查询
        employeeMapper.queryByCondition(con, resultHandler);
        
        // 测试
        List<EmployeeVO> results = resultHandler.getResults();
        assertTrue(!CollectionUtils.isEmpty(results));
        results.stream().forEach(System.err::println);
    }
    
    /**
     * RowBounds
     */
    @Test
    public void testRowBounds() {
        // 创建RowBounds
        RowBounds rowBounds = new RowBounds(0, 3);
        
        // 构建条件
        EmployeeCondition con = new EmployeeCondition();
        con.setDeleted(0);
        
        // 执行查询
        List<Employee> employees = employeeMapper.queryByCondition(con, rowBounds);
        
        // 测试
        assertTrue(!CollectionUtils.isEmpty(employees));
        employees.stream().forEach(System.err::println);
    }
    
    
    /**
     * 延迟加载
     */
    @Test
    public void testLazyLoading() throws Exception {
        // 先查员工
        Employee employee = employeeMapper.queryById("cc6b08506cdb11ea802000fffc35d9fe");
        
        // 获取部门
        // Department department = employee.getDepartment();
        
        // 测试
        System.err.println(employee);
    }
    
    /**
     * 自动映射
     */
    @Test
    public void testAutoMappingBehavior() throws Exception {
        // 先查员工
        Employee employee = employeeMapper.queryById2("cc6b08506cdb11ea802000fffc35d9fe");
        
        // 获取部门
        // Department department = employee.getDepartment();
        
        // 测试
        System.err.println(employee);
    }
}
