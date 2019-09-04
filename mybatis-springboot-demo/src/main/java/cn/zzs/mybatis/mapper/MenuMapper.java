package cn.zzs.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.zzs.mybatis.pojo.Menu;
import cn.zzs.mybatis.pojo.MenuExample;

public interface MenuMapper {
    long countByExample(MenuExample example);

    int deleteByExample(MenuExample example);

    int deleteByPrimaryKey(String id);

    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> selectByExample(MenuExample example);

    Menu selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
    
    /**
     * 
     * @Title: selectRelatedRoleByPrimaryKey
     * @Description: 根据id查询菜单并返回角色
     * @author: zzs
     * @date: 2019年9月3日 下午10:33:52
     * @param id
     */
    List<Menu> selectRelatedRoleByPrimaryKey(String id);
    
    /**
     * 
     * @Title: selectRelatedRoleByExample
     * @Description: 根据条件查询菜单并返回角色
     * @author: zzs
     * @date: 2019年9月3日 下午10:33:52
     * @param example
     */
    List<Menu> selectRelatedRoleByExample(MenuExample example);
    
    /**
     * 
     * @Title: selectRootRelatedChildren
     * @Description: 查询根菜单并返回子菜单
     * @author: zzs
     * @date: 2019年9月4日 上午10:48:18
     * @return: Menu
     */
    Menu selectRootRelatedChildren();
    
    /**
     * 
     * @Title: selectRootRelatedChildrenByPrimaryKey
     * @Description: 根据id查询菜单并返回子菜单
     * @author: zzs
     * @date: 2019年9月4日 上午10:58:46
     * @return: Menu
     */
    Menu selectRootRelatedChildrenByPrimaryKey();
}