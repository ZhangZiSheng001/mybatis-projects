package cn.zzs.mybatis.mapper;

import static cn.zzs.mybatis.mapper.EmployeeDynamicSqlSupport.address;
import static cn.zzs.mybatis.mapper.EmployeeDynamicSqlSupport.departmentId;
import static cn.zzs.mybatis.mapper.EmployeeDynamicSqlSupport.gmtCreate;
import static cn.zzs.mybatis.mapper.EmployeeDynamicSqlSupport.name;
import static cn.zzs.mybatis.mapper.EmployeeDynamicSqlSupport.status;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualToWhenPresent;
import static org.mybatis.dynamic.sql.SqlBuilder.isIn;
import static org.mybatis.dynamic.sql.SqlBuilder.isLikeWhenPresent;
import static org.mybatis.dynamic.sql.SqlBuilder.or;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mybatis.dynamic.sql.select.join.EqualTo;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.zzs.mybatis.entity.Employee;
import cn.zzs.mybatis.entity.EmployeeVO;
import cn.zzs.mybatis.util.MybatisUtils;


/**
 * <p>测试EmployeeMapper</p>
 * @author zzs
 * @date 2020年5月3日 上午10:27:45
 */
public class EmployeeMapperTest {
    
    private EmployeeMapper baseMapper;
    
    @Before
    public void init() {
        MybatisUtils.startSqlSession();
        baseMapper = MybatisUtils.getMapper(EmployeeMapper.class);
    }
    
    @After
    public void release() {
        MybatisUtils.close();
    }

    /**
     * Test method for {@link cn.zzs.mybatis.mapper.EmployeeMapper#deleteByPrimaryKey(java.lang.String)}.
     */
    @Test
    public void testDeleteByPrimaryKey() {
        String id = "e696b59f01d046aeb931e0f853f309be";
        baseMapper.deleteByPrimaryKey(id);
        MybatisUtils.commit();
    }

    /**
     * Test method for {@link cn.zzs.mybatis.mapper.EmployeeMapper#insert(cn.zzs.mybatis.entity.Employee)}.
     */
    @Test
    public void testInsertEmployee() {
        Employee employee = new Employee()
                .withId(UUID.randomUUID().toString().replace("-", ""))
                .withName("zzs005")
                .withGender(true)
                .withNo("zzs005")
                .withPassword("admin")
                .withPhone("18826****41")
                .withAddress("广东")
                .withStatus((byte)1)
                .withDeleted(false)
                .withDepartmentId("94e2d2e56cd811ea802000fffc35d9fa")
                .withGmtCreate(new Date())
                .withGmtModified(new Date());
        baseMapper.insert(employee);
        MybatisUtils.commit();
    }

    /**
     * Test method for {@link cn.zzs.mybatis.mapper.EmployeeMapper#insertMultiple(java.util.Collection)}.
     */
    @Test
    public void testInsertMultipleCollectionOfEmployee() {
        Employee employee = new Employee()
                .withId(UUID.randomUUID().toString().replace("-", ""))
                .withName("zzs005")
                .withGender(true)
                .withNo("zzs005")
                .withPassword("admin")
                .withPhone("18826****41")
                .withAddress("广东")
                .withStatus((byte)1)
                .withDeleted(false)
                .withDepartmentId("94e2d2e56cd811ea802000fffc35d9fa")
                .withGmtCreate(new Date())
                .withGmtModified(new Date());
        List<Employee> list = new ArrayList<>();
        list.add(employee);
        baseMapper.insertMultiple(list);
        MybatisUtils.commit();
    }

    /**
     * Test method for {@link cn.zzs.mybatis.mapper.EmployeeMapper#selectByPrimaryKey(java.lang.String)}.
     */
    @Test
    public void testSelectByPrimaryKey() {
        String id = "cc6b08506cdb11ea802000fffc35d9fa";
        Optional<Employee> optional = baseMapper.selectByPrimaryKey(id);
        optional.ifPresent(System.err::println);
    }
    
    /**
     * Test method for {@link cn.zzs.mybatis.mapper.EmployeeMapper#selectOne(org.mybatis.dynamic.sql.select.SelectDSLCompleter)}.
     */
    @Test
    public void testSelectOneSelectDSLCompleter() {
        // 注意，当查询结果多于1时会报错
        Optional<Employee> optional = baseMapper.selectOne(c ->
                                        c.where(name, isEqualToWhenPresent("zzs001"))
                                      );
        optional.ifPresent(System.err::println);
    }

    /**
     * Test method for {@link cn.zzs.mybatis.mapper.EmployeeMapper#select(org.mybatis.dynamic.sql.select.SelectDSLCompleter)}.
     */
    @Test
    public void testSelect() {
        List<Employee> lsit = baseMapper.select(c ->
                                        c.leftJoin(DepartmentDynamicSqlSupport.department)
                                        .on(departmentId, new EqualTo(DepartmentDynamicSqlSupport.id))
                                        .where(name, isLikeWhenPresent("zzs%"), or(name, isLikeWhenPresent("zzf%")))
                                        .and(status, isEqualTo((byte)1))
                                        .and(address, isIn("北京", "广东"))
                                        .and(DepartmentDynamicSqlSupport.name, isEqualToWhenPresent("质控部"))
                                        .orderBy(gmtCreate.descending())
                                        .limit(3)
                                        .offset(1)
                                      );
        lsit.forEach(System.err::println);
    }
    
    
    @Test
    public void testSelectPage() {
        // 设置分页信息
        PageHelper.startPage(2, 3);
        List<Employee> list = baseMapper.select(c ->
                                        c.leftJoin(DepartmentDynamicSqlSupport.department)
                                        .on(departmentId, new EqualTo(DepartmentDynamicSqlSupport.id))
                                        .where(name, isLikeWhenPresent("zzs%"), or(name, isLikeWhenPresent("zzf%")))
                                        .and(status, isEqualTo((byte)1))
                                        .and(address, isIn("北京", "广东"))
                                        .and(DepartmentDynamicSqlSupport.name, isEqualToWhenPresent("质控部"))
                                        .orderBy(gmtCreate.descending())
                                      );
        // 封装分页模型
        PageInfo<Employee> pageInfo = new PageInfo<>(list);

        // 取分页模型的数据
        System.err.println("查询总数" + pageInfo.getTotal());
    }


    /**
     * Test method for {@link cn.zzs.mybatis.mapper.EmployeeMapper#updateByPrimaryKey(cn.zzs.mybatis.entity.Employee)}.
     */
    @Test
    public void testUpdateByPrimaryKey() {
        String id = "cc6b08506cdb11ea802000fffc35d9fa";
        Optional<Employee> optional = baseMapper.selectByPrimaryKey(id);
        optional.ifPresent(e -> {
            e.setAddress("河南");
            e.setStatus((byte)2);
            baseMapper.updateByPrimaryKey(e);
        });
    }

    /**
     * Test method for {@link cn.zzs.mybatis.mapper.EmployeeMapper#updateByPrimaryKeySelective(cn.zzs.mybatis.entity.Employee)}.
     */
    @Test
    public void testUpdateByPrimaryKeySelective() {
        String id = "cc6b08506cdb11ea802000fffc35d9fa";
        Optional<Employee> optional = baseMapper.selectByPrimaryKey(id);
        optional.ifPresent(e -> {
            e.setAddress("河南");
            e.setStatus((byte)2);
            baseMapper.updateByPrimaryKeySelective(e);
        });
    }
    
    /**
     * 测试多表映射
     * @author zzs
     * @date 2021年6月28日 下午1:26:47 void
     */
    @Test
    public void testMultiTableMap() {
        List<EmployeeVO> list = baseMapper.selectVO(c ->
                c.leftJoin(DepartmentDynamicSqlSupport.department)
                .on(departmentId, new EqualTo(DepartmentDynamicSqlSupport.id))
                .where(name, isLikeWhenPresent("zzs%"), or(name, isLikeWhenPresent("zzf%")))
                .and(status, isEqualTo((byte)1))
                .orderBy(gmtCreate.descending())
      );
      list.stream().forEach(System.err::println);
    }
    
    /**
     * 测试子查询
     * @author zzs
     * @date 2021年6月28日 下午8:30:52 void
     */
    @Test
    public void testSubQuery() {
        List<Employee> list = baseMapper.selectSub(c -> 
                c.orderBy(gmtCreate.descending())
                );
        list.stream().forEach(System.err::println);
    }

}
