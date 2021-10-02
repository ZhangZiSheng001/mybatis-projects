package cn.zzs.mybatis.mapper;

import cn.zzs.mybatis.entity.Department;

public interface DepartmentMapper {
    
    Department queryById(String id);
}