package cn.zzs.mybatis.mapper;

import cn.zzs.mybatis.repository.dataobject.SalesEngineeringServiceOrder;
import cn.zzs.mybatis.repository.dataobject.SalesEngineeringServiceOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesEngineeringServiceOrderMapper {
    long countByExample(SalesEngineeringServiceOrderExample example);

    int deleteByExample(SalesEngineeringServiceOrderExample example);

    int deleteByPrimaryKey(String id);

    int insert(SalesEngineeringServiceOrder record);

    int insertSelective(SalesEngineeringServiceOrder record);

    List<SalesEngineeringServiceOrder> selectByExample(SalesEngineeringServiceOrderExample example);

    SalesEngineeringServiceOrder selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SalesEngineeringServiceOrder record, @Param("example") SalesEngineeringServiceOrderExample example);

    int updateByExample(@Param("record") SalesEngineeringServiceOrder record, @Param("example") SalesEngineeringServiceOrderExample example);

    int updateByPrimaryKeySelective(SalesEngineeringServiceOrder record);

    int updateByPrimaryKey(SalesEngineeringServiceOrder record);
}