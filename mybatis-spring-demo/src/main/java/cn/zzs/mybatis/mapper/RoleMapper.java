package cn.zzs.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.zzs.mybatis.pojo.Role;
import cn.zzs.mybatis.pojo.RoleExample;

public interface RoleMapper {
	long countByExample(RoleExample example);

	int deleteByExample(RoleExample example);

	int deleteByPrimaryKey(Long id);

	int insert(Role record);

	int insertSelective(Role record);

	List<Role> selectByExample(RoleExample example);

	Role selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

	int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

	int updateByPrimaryKeySelective(Role record);

	int updateByPrimaryKey(Role record);

	/**
	 * 
	 * @Title: selectRelatedUserByPrimaryKey
	 * @Description: 根据id查询角色并返回用户角色
	 * @author: zzs
	 * @date: 2019年9月3日 下午10:33:52
	 * @param id
	 */
	List<Role> selectRelatedUserByPrimaryKey(Long id);

	/**
	 * 
	 * @Title: selectRelatedUserByExample
	 * @Description: 根据条件查询角色并返回用户角色
	 * @author: zzs
	 * @date: 2019年9月3日 下午10:33:52
	 * @param example
	 */
	List<Role> selectRelatedUserByExample(RoleExample example);

	/**
	 * 
	 * @Title: selectRelatedMenuByPrimaryKey
	 * @Description: 根据id查询角色并返回菜单角色
	 * @author: zzs
	 * @date: 2019年9月3日 下午10:33:52
	 * @param id
	 */
	List<Role> selectRelatedMenuByPrimaryKey(Long id);

	/**
	 * 
	 * @Title: selectRelatedMenuByExample
	 * @Description: 根据条件查询角色并返回菜单角色
	 * @author: zzs
	 * @date: 2019年9月3日 下午10:33:52
	 * @param example
	 */
	List<Role> selectRelatedMenuByExample(RoleExample example);
	
	/**
	 * 
	 * @Title: setMenuByPrimaryKey
	 * @Description: 设置指定角色的菜单
	 * @author: zzs
	 * @date: 2019年9月4日 上午11:46:19
	 * @param id
	 * @param menuId
	 * @return: void
	 */
	void setMenuByPrimaryKey(@Param("id")Long id,@Param("menuId")String menuId);
}