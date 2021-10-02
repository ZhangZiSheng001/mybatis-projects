package cn.zzs.mybatis.mapper;

import java.util.List;

import cn.zzs.mybatis.entity.Role;

public interface RoleMapper {

    List<Role> queryByEmployeeId(String employeeId);
}