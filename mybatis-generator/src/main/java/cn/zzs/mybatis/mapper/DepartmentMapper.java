package cn.zzs.mybatis.mapper;

import static cn.zzs.mybatis.mapper.DepartmentDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.zzs.mybatis.entity.Department;
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
public interface DepartmentMapper {
    BasicColumn[] selectList = BasicColumn.columnList(id, no, parentId, name, type, deleted, gmtCreate, gmtModified);

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
    int insert(InsertStatementProvider<Department> insertStatement);

    /**
     * @param multipleInsertStatement
     * @return int
     */
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Department> multipleInsertStatement);

    /**
     * @param selectStatement
     * @return Optional<Department>
     */
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DepartmentResult")
    Optional<Department> selectOne(SelectStatementProvider selectStatement);

    /**
     * @param selectStatement
     * @return List<Department>
     */
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DepartmentResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="no", property="no", jdbcType=JdbcType.VARCHAR),
        @Result(column="parent_id", property="parentId", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.BIT),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Department> selectMany(SelectStatementProvider selectStatement);

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
        return MyBatis3Utils.countFrom(this::count, department, completer);
    }

    /**
     * @param completer
     */
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, department, completer);
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
    default int insert(Department record) {
        return MyBatis3Utils.insert(this::insert, record, department, c ->
            c.map(id).toProperty("id")
            .map(no).toProperty("no")
            .map(parentId).toProperty("parentId")
            .map(name).toProperty("name")
            .map(type).toProperty("type")
            .map(deleted).toProperty("deleted")
            .map(gmtCreate).toProperty("gmtCreate")
            .map(gmtModified).toProperty("gmtModified")
        );
    }

    /**
     */
    default int insertMultiple(Collection<Department> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, department, c ->
            c.map(id).toProperty("id")
            .map(no).toProperty("no")
            .map(parentId).toProperty("parentId")
            .map(name).toProperty("name")
            .map(type).toProperty("type")
            .map(deleted).toProperty("deleted")
            .map(gmtCreate).toProperty("gmtCreate")
            .map(gmtModified).toProperty("gmtModified")
        );
    }

    /**
     */
    default int insertSelective(Department record) {
        return MyBatis3Utils.insert(this::insert, record, department, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(no).toPropertyWhenPresent("no", record::getNo)
            .map(parentId).toPropertyWhenPresent("parentId", record::getParentId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(type).toPropertyWhenPresent("type", record::getType)
            .map(deleted).toPropertyWhenPresent("deleted", record::getDeleted)
            .map(gmtCreate).toPropertyWhenPresent("gmtCreate", record::getGmtCreate)
            .map(gmtModified).toPropertyWhenPresent("gmtModified", record::getGmtModified)
        );
    }

    /**
     * @param completer
     */
    default Optional<Department> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, department, completer);
    }

    /**
     * @param completer
     */
    default List<Department> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, department, completer);
    }

    /**
     * @param completer
     */
    default List<Department> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, department, completer);
    }

    /**
     */
    default Optional<Department> selectByPrimaryKey(String id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    /**
     * @param completer
     */
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, department, completer);
    }

    /**
     */
    static UpdateDSL<UpdateModel> updateAllColumns(Department record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(no).equalTo(record::getNo)
                .set(parentId).equalTo(record::getParentId)
                .set(name).equalTo(record::getName)
                .set(type).equalTo(record::getType)
                .set(deleted).equalTo(record::getDeleted)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified);
    }

    /**
     */
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Department record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(no).equalToWhenPresent(record::getNo)
                .set(parentId).equalToWhenPresent(record::getParentId)
                .set(name).equalToWhenPresent(record::getName)
                .set(type).equalToWhenPresent(record::getType)
                .set(deleted).equalToWhenPresent(record::getDeleted)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified);
    }

    /**
     */
    default int updateByPrimaryKey(Department record) {
        return update(c ->
            c.set(no).equalTo(record::getNo)
            .set(parentId).equalTo(record::getParentId)
            .set(name).equalTo(record::getName)
            .set(type).equalTo(record::getType)
            .set(deleted).equalTo(record::getDeleted)
            .set(gmtCreate).equalTo(record::getGmtCreate)
            .set(gmtModified).equalTo(record::getGmtModified)
            .where(id, isEqualTo(record::getId))
        );
    }

    /**
     */
    default int updateByPrimaryKeySelective(Department record) {
        return update(c ->
            c.set(no).equalToWhenPresent(record::getNo)
            .set(parentId).equalToWhenPresent(record::getParentId)
            .set(name).equalToWhenPresent(record::getName)
            .set(type).equalToWhenPresent(record::getType)
            .set(deleted).equalToWhenPresent(record::getDeleted)
            .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
            .set(gmtModified).equalToWhenPresent(record::getGmtModified)
            .where(id, isEqualTo(record::getId))
        );
    }
}