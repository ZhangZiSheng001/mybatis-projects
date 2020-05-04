package cn.zzs.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.zzs.mybatis.condition.DepartmentCondition;
import cn.zzs.mybatis.entity.Department;

public interface DepartmentMapper {

    long countByCondition(@Param("con") DepartmentCondition con);

    int deleteByCondition(@Param("con") DepartmentCondition con);

    int deleteByPrimaryKey(String id);

    int insert(Department department);

    List<Department> selectByCondition(@Param("con") DepartmentCondition con);

    Department selectByPrimaryKey(String id);

    int updateByCondition(@Param("record") Department department, @Param("con") DepartmentCondition con);

    int updateByPrimaryKey(Department department);
}