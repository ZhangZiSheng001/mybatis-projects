package cn.zzs.mybatis.mapper;

import static cn.zzs.mybatis.mapper.RoleDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.zzs.mybatis.entity.Role;
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
public interface RoleMapper {
    BasicColumn[] selectList = BasicColumn.columnList(id, name, isGeneral, deleted, gmtCreate, gmtModified);

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
    int insert(InsertStatementProvider<Role> insertStatement);

    /**
     * @param multipleInsertStatement
     * @return int
     */
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Role> multipleInsertStatement);

    /**
     * @param selectStatement
     * @return Optional<Role>
     */
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RoleResult")
    Optional<Role> selectOne(SelectStatementProvider selectStatement);

    /**
     * @param selectStatement
     * @return List<Role>
     */
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RoleResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_general", property="isGeneral", jdbcType=JdbcType.BIT),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.BIT),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Role> selectMany(SelectStatementProvider selectStatement);

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
        return MyBatis3Utils.countFrom(this::count, role, completer);
    }

    /**
     * @param completer
     */
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, role, completer);
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
    default int insert(Role record) {
        return MyBatis3Utils.insert(this::insert, record, role, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(isGeneral).toProperty("isGeneral")
            .map(deleted).toProperty("deleted")
            .map(gmtCreate).toProperty("gmtCreate")
            .map(gmtModified).toProperty("gmtModified")
        );
    }

    /**
     */
    default int insertMultiple(Collection<Role> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, role, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(isGeneral).toProperty("isGeneral")
            .map(deleted).toProperty("deleted")
            .map(gmtCreate).toProperty("gmtCreate")
            .map(gmtModified).toProperty("gmtModified")
        );
    }

    /**
     */
    default int insertSelective(Role record) {
        return MyBatis3Utils.insert(this::insert, record, role, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(isGeneral).toPropertyWhenPresent("isGeneral", record::getIsGeneral)
            .map(deleted).toPropertyWhenPresent("deleted", record::getDeleted)
            .map(gmtCreate).toPropertyWhenPresent("gmtCreate", record::getGmtCreate)
            .map(gmtModified).toPropertyWhenPresent("gmtModified", record::getGmtModified)
        );
    }

    /**
     * @param completer
     */
    default Optional<Role> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, role, completer);
    }

    /**
     * @param completer
     */
    default List<Role> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, role, completer);
    }

    /**
     * @param completer
     */
    default List<Role> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, role, completer);
    }

    /**
     */
    default Optional<Role> selectByPrimaryKey(String id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    /**
     * @param completer
     */
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, role, completer);
    }

    /**
     */
    static UpdateDSL<UpdateModel> updateAllColumns(Role record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(isGeneral).equalTo(record::getIsGeneral)
                .set(deleted).equalTo(record::getDeleted)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified);
    }

    /**
     */
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Role record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(isGeneral).equalToWhenPresent(record::getIsGeneral)
                .set(deleted).equalToWhenPresent(record::getDeleted)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified);
    }

    /**
     */
    default int updateByPrimaryKey(Role record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(isGeneral).equalTo(record::getIsGeneral)
            .set(deleted).equalTo(record::getDeleted)
            .set(gmtCreate).equalTo(record::getGmtCreate)
            .set(gmtModified).equalTo(record::getGmtModified)
            .where(id, isEqualTo(record::getId))
        );
    }

    /**
     */
    default int updateByPrimaryKeySelective(Role record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(isGeneral).equalToWhenPresent(record::getIsGeneral)
            .set(deleted).equalToWhenPresent(record::getDeleted)
            .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
            .set(gmtModified).equalToWhenPresent(record::getGmtModified)
            .where(id, isEqualTo(record::getId))
        );
    }
}