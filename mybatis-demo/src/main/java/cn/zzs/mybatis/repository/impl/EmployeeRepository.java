package cn.zzs.mybatis.repository.impl;

import java.util.List;

import cn.zzs.mybatis.condition.EmployeeCondition;
import cn.zzs.mybatis.entity.Employee;
import cn.zzs.mybatis.mapper.EmployeeMapper;
import cn.zzs.mybatis.repository.IEmployeeRepository;
import cn.zzs.mybatis.util.MybatisUtils;

/**
 * <p>用户 Repository实现类</p>
 * @author: zzs
 * @date: 2020年3月23日 下午4:53:55
 */
public class EmployeeRepository implements IEmployeeRepository {

    @Override
    public Employee get(String id) {
        return MybatisUtils.getMapper(EmployeeMapper.class).selectByPrimaryKey(id);
    }

    @Override
    public List<Employee> list(EmployeeCondition con) {
        return MybatisUtils.getMapper(EmployeeMapper.class).selectByCondition(con);
    }
    
    @Override
    public List<Employee> list2(EmployeeCondition con) {
        return MybatisUtils.getMapper(EmployeeMapper.class).selectByCondition2(con);
    }

    @Override
    public long count(EmployeeCondition con) {
        return MybatisUtils.getMapper(EmployeeMapper.class).countByCondition(con);
    }

    @Override
    public int delete(EmployeeCondition con) {
        return MybatisUtils.getMapper(EmployeeMapper.class).deleteByCondition(con);
    }

    @Override
    public int delete(String id) {
        return MybatisUtils.getMapper(EmployeeMapper.class).deleteByPrimaryKey(id);
    }

    @Override
    public int save(Employee employee) {
        return MybatisUtils.getMapper(EmployeeMapper.class).insert(employee);
    }

    @Override
    public int saveBatch(List<Employee> list) {
        return MybatisUtils.getMapper(EmployeeMapper.class).insertBatch(list);
    }

    @Override
    public int update(Employee employee, EmployeeCondition con) {
        return MybatisUtils.getMapper(EmployeeMapper.class).updateByCondition(employee, con);
    }

    @Override
    public int update(Employee employee) {
        return MybatisUtils.getMapper(EmployeeMapper.class).updateByPrimaryKey(employee);
    }

}
