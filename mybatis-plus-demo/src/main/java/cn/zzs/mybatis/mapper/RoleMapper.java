package cn.zzs.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.zzs.mybatis.condition.RoleCondition;
import cn.zzs.mybatis.entity.Role;

public interface RoleMapper {

    long countByCondition(@Param("con") RoleCondition con);

    int deleteByCondition(@Param("con") RoleCondition con);

    int deleteByPrimaryKey(String id);

    int insert(Role role);

    List<Role> selectByCondition(@Param("con") RoleCondition con);

    Role selectByPrimaryKey(String id);

    int updateByCondition(@Param("record") Role role, @Param("con") RoleCondition con);

    int updateByPrimaryKey(Role role);

    List<Role> selectByEmployeeId(String employeeId);
}