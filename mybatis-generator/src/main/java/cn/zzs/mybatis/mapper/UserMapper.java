package cn.zzs.mybatis.mapper;

import static cn.zzs.mybatis.mapper.UserDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.zzs.mybatis.entity.User;
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
public interface UserMapper {
    BasicColumn[] selectList = BasicColumn.columnList(id, name, gender, age, gmtCreate, gmtModified, deleted, phone);

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
    int insert(InsertStatementProvider<User> insertStatement);

    /**
     * @param multipleInsertStatement
     * @return int
     */
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<User> multipleInsertStatement);

    /**
     * @param selectStatement
     * @return Optional<User>
     */
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UserResult")
    Optional<User> selectOne(SelectStatementProvider selectStatement);

    /**
     * @param selectStatement
     * @return List<User>
     */
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UserResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="gender", property="gender", jdbcType=JdbcType.BIT),
        @Result(column="age", property="age", jdbcType=JdbcType.INTEGER),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.BIT),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR)
    })
    List<User> selectMany(SelectStatementProvider selectStatement);

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
        return MyBatis3Utils.countFrom(this::count, user, completer);
    }

    /**
     * @param completer
     */
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, user, completer);
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
    default int insert(User record) {
        return MyBatis3Utils.insert(this::insert, record, user, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(gender).toProperty("gender")
            .map(age).toProperty("age")
            .map(gmtCreate).toProperty("gmtCreate")
            .map(gmtModified).toProperty("gmtModified")
            .map(deleted).toProperty("deleted")
            .map(phone).toProperty("phone")
        );
    }

    /**
     */
    default int insertMultiple(Collection<User> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, user, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(gender).toProperty("gender")
            .map(age).toProperty("age")
            .map(gmtCreate).toProperty("gmtCreate")
            .map(gmtModified).toProperty("gmtModified")
            .map(deleted).toProperty("deleted")
            .map(phone).toProperty("phone")
        );
    }

    /**
     */
    default int insertSelective(User record) {
        return MyBatis3Utils.insert(this::insert, record, user, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(gender).toPropertyWhenPresent("gender", record::getGender)
            .map(age).toPropertyWhenPresent("age", record::getAge)
            .map(gmtCreate).toPropertyWhenPresent("gmtCreate", record::getGmtCreate)
            .map(gmtModified).toPropertyWhenPresent("gmtModified", record::getGmtModified)
            .map(deleted).toPropertyWhenPresent("deleted", record::getDeleted)
            .map(phone).toPropertyWhenPresent("phone", record::getPhone)
        );
    }

    /**
     * @param completer
     */
    default Optional<User> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, user, completer);
    }

    /**
     * @param completer
     */
    default List<User> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, user, completer);
    }

    /**
     * @param completer
     */
    default List<User> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, user, completer);
    }

    /**
     */
    default Optional<User> selectByPrimaryKey(String id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    /**
     * @param completer
     */
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, user, completer);
    }

    /**
     */
    static UpdateDSL<UpdateModel> updateAllColumns(User record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(gender).equalTo(record::getGender)
                .set(age).equalTo(record::getAge)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified)
                .set(deleted).equalTo(record::getDeleted)
                .set(phone).equalTo(record::getPhone);
    }

    /**
     */
    static UpdateDSL<UpdateModel> updateSelectiveColumns(User record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(gender).equalToWhenPresent(record::getGender)
                .set(age).equalToWhenPresent(record::getAge)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified)
                .set(deleted).equalToWhenPresent(record::getDeleted)
                .set(phone).equalToWhenPresent(record::getPhone);
    }

    /**
     */
    default int updateByPrimaryKey(User record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(gender).equalTo(record::getGender)
            .set(age).equalTo(record::getAge)
            .set(gmtCreate).equalTo(record::getGmtCreate)
            .set(gmtModified).equalTo(record::getGmtModified)
            .set(deleted).equalTo(record::getDeleted)
            .set(phone).equalTo(record::getPhone)
            .where(id, isEqualTo(record::getId))
        );
    }

    /**
     */
    default int updateByPrimaryKeySelective(User record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(gender).equalToWhenPresent(record::getGender)
            .set(age).equalToWhenPresent(record::getAge)
            .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
            .set(gmtModified).equalToWhenPresent(record::getGmtModified)
            .set(deleted).equalToWhenPresent(record::getDeleted)
            .set(phone).equalToWhenPresent(record::getPhone)
            .where(id, isEqualTo(record::getId))
        );
    }
}