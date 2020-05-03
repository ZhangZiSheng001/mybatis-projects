package cn.zzs.mybatis.mapper;

import static cn.zzs.mybatis.mapper.EmployeeRoleDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.zzs.mybatis.entity.EmployeeRole;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface EmployeeRoleMapper {
    BasicColumn[] selectList = BasicColumn.columnList(id, employeeId, roleId);

    /**
     * @param selectStatement
     * @return long
     */
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    /**
     * @param deleteStatement
     * @return int
     */
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    /**
     * @param insertStatement
     * @return int
     */
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<EmployeeRole> insertStatement);

    /**
     * @param multipleInsertStatement
     * @return int
     */
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<EmployeeRole> multipleInsertStatement);

    /**
     * @param selectStatement
     * @return Optional<EmployeeRole>
     */
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("EmployeeRoleResult")
    Optional<EmployeeRole> selectOne(SelectStatementProvider selectStatement);

    /**
     * @param selectStatement
     * @return List<EmployeeRole>
     */
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="EmployeeRoleResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="employee_id", property="employeeId", jdbcType=JdbcType.VARCHAR),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.VARCHAR)
    })
    List<EmployeeRole> selectMany(SelectStatementProvider selectStatement);

    /**
     * @param updateStatement
     * @return int
     */
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    /**
     * @param completer
     */
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, employeeRole, completer);
    }

    /**
     * @param completer
     */
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, employeeRole, completer);
    }

    /**
     */
    default int deleteByPrimaryKey(String id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    /**
     */
    default int insert(EmployeeRole record) {
        return MyBatis3Utils.insert(this::insert, record, employeeRole, c ->
            c.map(id).toProperty("id")
            .map(employeeId).toProperty("employeeId")
            .map(roleId).toProperty("roleId")
        );
    }

    /**
     */
    default int insertMultiple(Collection<EmployeeRole> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, employeeRole, c ->
            c.map(id).toProperty("id")
            .map(employeeId).toProperty("employeeId")
            .map(roleId).toProperty("roleId")
        );
    }

    /**
     */
    default int insertSelective(EmployeeRole record) {
        return MyBatis3Utils.insert(this::insert, record, employeeRole, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(employeeId).toPropertyWhenPresent("employeeId", record::getEmployeeId)
            .map(roleId).toPropertyWhenPresent("roleId", record::getRoleId)
        );
    }

    /**
     * @param completer
     */
    default Optional<EmployeeRole> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, employeeRole, completer);
    }

    /**
     * @param completer
     */
    default List<EmployeeRole> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, employeeRole, completer);
    }

    /**
     * @param completer
     */
    default List<EmployeeRole> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, employeeRole, completer);
    }

    /**
     */
    default Optional<EmployeeRole> selectByPrimaryKey(String id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    /**
     * @param completer
     */
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, employeeRole, completer);
    }

    /**
     */
    static UpdateDSL<UpdateModel> updateAllColumns(EmployeeRole record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(employeeId).equalTo(record::getEmployeeId)
                .set(roleId).equalTo(record::getRoleId);
    }

    /**
     */
    static UpdateDSL<UpdateModel> updateSelectiveColumns(EmployeeRole record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(employeeId).equalToWhenPresent(record::getEmployeeId)
                .set(roleId).equalToWhenPresent(record::getRoleId);
    }

    /**
     */
    default int updateByPrimaryKey(EmployeeRole record) {
        return update(c ->
            c.set(employeeId).equalTo(record::getEmployeeId)
            .set(roleId).equalTo(record::getRoleId)
            .where(id, isEqualTo(record::getId))
        );
    }

    /**
     */
    default int updateByPrimaryKeySelective(EmployeeRole record) {
        return update(c ->
            c.set(employeeId).equalToWhenPresent(record::getEmployeeId)
            .set(roleId).equalToWhenPresent(record::getRoleId)
            .where(id, isEqualTo(record::getId))
        );
    }
}