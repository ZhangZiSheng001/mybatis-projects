package cn.zzs.mybatis.mapper;

import cn.zzs.mybatis.pojo.User;
import cn.zzs.mybatis.pojo.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    /**
     * 
     * @Title: selectRelatedRoleByPrimaryKey
     * @Description: 根据id查询用户并返回用户角色
     * @author: zzs
     * @date: 2019年9月3日 下午10:33:52
     * @param id
     */
    List<User> selectRelatedRoleByPrimaryKey(Long id);
    
    /**
     * 
     * @Title: selectRelatedRoleByExample
     * @Description: 根据条件查询用户并返回用户角色
     * @author: zzs
     * @date: 2019年9月3日 下午10:33:52
     * @param example
     */
    List<User> selectRelatedRoleByExample(UserExample example);
}