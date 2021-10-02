package cn.zzs.mybatis.mapper;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;


/**
 * <p>TODO</p>
 * @author: zzs
 * @date: 2020年4月15日 上午9:07:51
 */
@MappedTypes(value = String.class)
@MappedJdbcTypes(value = JdbcType.VARCHAR)
public class ExampleTypeHandler implements TypeHandler<String> {

    @Override
    public void setParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType) throws SQLException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getResult(ResultSet rs, String columnName) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getResult(ResultSet rs, int columnIndex) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getResult(CallableStatement cs, int columnIndex) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

}
