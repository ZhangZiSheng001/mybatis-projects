package cn.zzs.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.zzs.mybatis.condition.MenuCondition;
import cn.zzs.mybatis.entity.Menu;

public interface MenuMapper {

	long countByCondition(@Param("con") MenuCondition con);

	int deleteByCondition(@Param("con") MenuCondition con);

	int deleteByPrimaryKey(String id);

	int insert(Menu menu);

	List<Menu> selectByCondition(@Param("con") MenuCondition con);

	Menu selectByPrimaryKey(String id);

	int updateByCondition(@Param("record") Menu menu, @Param("con") MenuCondition con);

	List<Menu> selectByEmployeeId(String employeeId);
}