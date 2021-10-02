package cn.zzs.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import cn.zzs.mybatis.condition.EmployeeCondition;
import cn.zzs.mybatis.entity.Employee;
import cn.zzs.mybatis.vo.EmployeeVO;

/**
 * 员工 Mapper接口
 * @author zzs
 * @date 2021年9月28日 下午2:45:40
 */
public interface EmployeeMapper {

    /*@Select("select * from demo_employee where name = #{name} and gender = #{gender} and phone = #{phone} and deleted = 0")
    @ResultType(Employee.class)*/
    List<Employee> queryListByNameAndGenderAndPhone(@Param("name") String name, @Param("gender") Integer gender, @Param("phone") String phone);
    
    
    List<Employee> queryByCondition(@Param("con") EmployeeCondition condition);
    
    void queryByCondition(@Param("con") EmployeeCondition condition, ResultHandler<Employee> resultHandler);
    
    List<Employee> queryByCondition(@Param("con") EmployeeCondition condition, RowBounds rowBounds);
    
    Employee queryById(String id);
    
    EmployeeVO queryVOById(String id);


    Employee queryById2(String id);
    
}
