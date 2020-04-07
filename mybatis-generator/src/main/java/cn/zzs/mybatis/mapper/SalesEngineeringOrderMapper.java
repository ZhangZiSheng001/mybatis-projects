package cn.zzs.mybatis.mapper;

import cn.zzs.mybatis.repository.dataobject.SalesEngineeringOrder;
import cn.zzs.mybatis.repository.dataobject.SalesEngineeringOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesEngineeringOrderMapper {
    long countByExample(SalesEngineeringOrderExample example);

    int deleteByExample(SalesEngineeringOrderExample example);

    int deleteByPrimaryKey(String id);

    int insert(SalesEngineeringOrder record);

    int insertSelective(SalesEngineeringOrder record);

    List<SalesEngineeringOrder> selectByExample(SalesEngineeringOrderExample example);

    SalesEngineeringOrder selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SalesEngineeringOrder record, @Param("example") SalesEngineeringOrderExample example);

    int updateByExample(@Param("record") SalesEngineeringOrder record, @Param("example") SalesEngineeringOrderExample example);

    int updateByPrimaryKeySelective(SalesEngineeringOrder record);

    int updateByPrimaryKey(SalesEngineeringOrder record);
}