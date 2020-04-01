package cn.zzs.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.zzs.mybatis.condition.EmployeeCondition;
import cn.zzs.mybatis.entity.Employee;

public interface EmployeeMapper {

    long countByCondition(@Param("con") EmployeeCondition con);

    int deleteByCondition(@Param("con") EmployeeCondition con);

    int deleteByPrimaryKey(String id);

    int insert(Employee employee);

    int insertBatch(List<Employee> list);

    List<Employee> selectByCondition(@Param("con") EmployeeCondition con);

    Employee selectByPrimaryKey(String id);

    int updateByCondition(@Param("record") Employee employee, @Param("con") EmployeeCondition con);

    int updateByPrimaryKey(Employee employee);

}