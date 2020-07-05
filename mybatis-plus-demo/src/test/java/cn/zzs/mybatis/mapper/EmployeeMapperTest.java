package cn.zzs.mybatis.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import cn.zzs.mybatis.entity.Employee;
import cn.zzs.mybatis.util.MybatisUtils;


/**
 * <p>测试MBP</p>
 * @author zzs
 * @date 2020年5月3日 下午10:33:41
 */
public class EmployeeMapperTest {
    
    private EmployeeMapper baseMapper;
    
    @Before
    public void init() {
        MybatisUtils.startSqlSession();
        baseMapper = MybatisUtils.getMapper(EmployeeMapper.class);
    }
    
    @After
    public void after() {
        MybatisUtils.close();
    }

    @Test
    public void testInsert() {
        Employee employee = new Employee(
                UUID.randomUUID().toString().replace("-", ""), "zzs005", true, "zzs005", 
                "admin", "18826****41", "广东", 
                (byte)1, false, "94e2d2e56cd811ea802000fffc35d9fa", 
                new Date(), new Date());
        baseMapper.insert(employee);
        MybatisUtils.commit();
    }

    @Test
    public void testDeleteById() {
        String id = "c4d12cd07ca5487f8d4d5d9163a84ad2";
        baseMapper.deleteById(id);
        MybatisUtils.commit();
    }

    @Test
    public void testDeleteByMap() {
        String id = "cadcb7dcf2494ea3b96bac1ca580dd9b";
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("id", id);
        baseMapper.deleteByMap(map);
        MybatisUtils.commit();
    }

    @Test
    public void testDelete() {
        String id = "cadcb7dcf2494ea3b96bac1ca580dd9b";
        baseMapper.delete(Wrappers.<Employee>lambdaQuery().eq(Employee::getId, id));
        MybatisUtils.commit();
    }

    /**
     * Test method for {@link com.baomidou.mybatisplus.core.mapper.BaseMapper#deleteBatchIds(java.util.Collection)}.
     */
    @Test
    public void testDeleteBatchIds() {
        List<String> list = new ArrayList<>();
        list.add("999ad8e96a8841e4bacc3cd1dad2ef68");
        list.add("b68e4d4cc0124877a91e413824b97493");
        baseMapper.deleteBatchIds(list);
        MybatisUtils.commit();
    }

    @Test
    public void testUpdateById() {
        String id = "19b2387640b7416998bbe7d238d70689";
        Employee employee = baseMapper.selectById(id);
        employee.setAddress("河南");
        employee.setGmtCreate(new Date());
        employee.setGmtModified(new Date());
        baseMapper.updateById(employee);
        MybatisUtils.commit();
    }

    /**
     * Test method for {@link com.baomidou.mybatisplus.core.mapper.BaseMapper#update(java.lang.Object, com.baomidou.mybatisplus.core.conditions.Wrapper)}.
     */
    @Test
    public void testUpdate() {
        String name = "zzs005";
        Employee employee = new Employee();
        employee.setAddress("河南");
        employee.setGmtCreate(new Date());
        employee.setGmtModified(new Date());
        baseMapper.update(employee, Wrappers.<Employee>lambdaQuery().eq(Employee::getName, name));
        MybatisUtils.commit();
    }

    @Test
    public void testSelectById() {
        String id = "19b2387640b7416998bbe7d238d70689";
        Employee employee = baseMapper.selectById(id);
        System.err.println(employee);
    }

    @Test
    public void testSelectBatchIds() {
        List<String> list = new ArrayList<>();
        list.add("95533a7bbb57467084b102f01563d919");
        list.add("80397f0adaba4852b72142f44b31074c");
        List<Employee> employees = baseMapper.selectBatchIds(list);
        employees.forEach(System.err::println);
    }

    @Test
    public void testSelectByMap() {
        String id = "cc6b08506cdb11ea802000fffc35d9fa";
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("id", id);
        List<Employee> employees = baseMapper.selectByMap(map);
        employees.forEach(System.err::println);
    }

    @Test
    public void testSelectOne() {
        String id = "cc6b08506cdb11ea802000fffc35d9fa";
        Employee employee = baseMapper.selectOne(Wrappers.<Employee>lambdaQuery().eq(Employee::getId, id));
        System.err.println(employee);
    }

    @Test
    public void testSelectCount() {
        String name1 = "zzs005";
        String name2 = "zzs001";
        Integer count = baseMapper.selectCount(
                    Wrappers.<Employee>lambdaQuery()
                    .eq(Employee::getDeleted, false)
                    .and(c -> c.eq(Employee::getName, name1).or(i -> i.eq(Employee::getName, name2)))
                    .eq(Employee::getStatus, 1)
                );
        System.err.println(count);
    }

    @Test
    public void testSelectList() {
        
        List<Employee> list = baseMapper.selectList(
                    Wrappers.<Employee>lambdaQuery()
                    .select(Employee::getId, Employee::getName, Employee::getAddress)
                    .and(c -> c.eq(Employee::getName, "zzs005").or(i -> i.eq(Employee::getName, "zzs001")))
                    .eq(Employee::getDeleted, 0)
                    .eq(Employee::getStatus, 1)
                );
        list.forEach(System.err::println);
    }

    @Test
    public void testSelectPage() {
        Page<Employee> page = new Page<>(1, 3);
        baseMapper.selectPage(page, 
                Wrappers.<Employee>lambdaQuery()
                .eq(Employee::getName, "zzs005")
                .eq(Employee::getDeleted, 0)
                .eq(Employee::getStatus, 1)
            );
        System.err.println(page.getTotal());
        page.getRecords().forEach(System.err::println);
    }

}
