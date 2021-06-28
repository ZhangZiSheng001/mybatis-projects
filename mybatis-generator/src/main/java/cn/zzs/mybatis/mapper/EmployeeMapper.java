package cn.zzs.mybatis.mapper;

import static cn.zzs.mybatis.mapper.EmployeeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.zzs.mybatis.entity.Employee;
import cn.zzs.mybatis.entity.EmployeeVO;

import java.util.Arrays;
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
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectModel;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface EmployeeMapper {
    BasicColumn[] selectList = BasicColumn.columnList(id, name, gender, no, password, phone, address, status, deleted, departmentId, gmtCreate, gmtModified);

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
    int insert(InsertStatementProvider<Employee> insertStatement);

    /**
     * @param multipleInsertStatement
     * @return int
     */
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Employee> multipleInsertStatement);

    /**
     * @param selectStatement
     * @return Optional<Employee>
     */
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("EmployeeResult")
    Optional<Employee> selectOne(SelectStatementProvider selectStatement);

    /**
     * @param selectStatement
     * @return List<Employee>
     */
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="EmployeeResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="gender", property="gender", jdbcType=JdbcType.BIT),
        @Result(column="no", property="no", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.BIT),
        @Result(column="department_id", property="departmentId", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Employee> selectMany(SelectStatementProvider selectStatement);

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
        return MyBatis3Utils.countFrom(this::count, employee, completer);
    }

    /**
     * @param completer
     */
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, employee, completer);
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
    default int insert(Employee record) {
        return MyBatis3Utils.insert(this::insert, record, employee, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(gender).toProperty("gender")
            .map(no).toProperty("no")
            .map(password).toProperty("password")
            .map(phone).toProperty("phone")
            .map(address).toProperty("address")
            .map(status).toProperty("status")
            .map(deleted).toProperty("deleted")
            .map(departmentId).toProperty("departmentId")
            .map(gmtCreate).toProperty("gmtCreate")
            .map(gmtModified).toProperty("gmtModified")
        );
    }

    /**
     */
    default int insertMultiple(Collection<Employee> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, employee, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(gender).toProperty("gender")
            .map(no).toProperty("no")
            .map(password).toProperty("password")
            .map(phone).toProperty("phone")
            .map(address).toProperty("address")
            .map(status).toProperty("status")
            .map(deleted).toProperty("deleted")
            .map(departmentId).toProperty("departmentId")
            .map(gmtCreate).toProperty("gmtCreate")
            .map(gmtModified).toProperty("gmtModified")
        );
    }

    /**
     */
    default int insertSelective(Employee record) {
        return MyBatis3Utils.insert(this::insert, record, employee, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(gender).toPropertyWhenPresent("gender", record::getGender)
            .map(no).toPropertyWhenPresent("no", record::getNo)
            .map(password).toPropertyWhenPresent("password", record::getPassword)
            .map(phone).toPropertyWhenPresent("phone", record::getPhone)
            .map(address).toPropertyWhenPresent("address", record::getAddress)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
            .map(deleted).toPropertyWhenPresent("deleted", record::getDeleted)
            .map(departmentId).toPropertyWhenPresent("departmentId", record::getDepartmentId)
            .map(gmtCreate).toPropertyWhenPresent("gmtCreate", record::getGmtCreate)
            .map(gmtModified).toPropertyWhenPresent("gmtModified", record::getGmtModified)
        );
    }

    /**
     * @param completer
     */
    default Optional<Employee> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, employee, completer);
    }

    /**
     * @param completer
     */
    default List<Employee> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, employee, completer);
    }

    /**
     * @param completer
     */
    default List<Employee> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, employee, completer);
    }

    /**
     */
    default Optional<Employee> selectByPrimaryKey(String id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    /**
     * @param completer
     */
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, employee, completer);
    }

    /**
     */
    static UpdateDSL<UpdateModel> updateAllColumns(Employee record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(gender).equalTo(record::getGender)
                .set(no).equalTo(record::getNo)
                .set(password).equalTo(record::getPassword)
                .set(phone).equalTo(record::getPhone)
                .set(address).equalTo(record::getAddress)
                .set(status).equalTo(record::getStatus)
                .set(deleted).equalTo(record::getDeleted)
                .set(departmentId).equalTo(record::getDepartmentId)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified);
    }

    /**
     */
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Employee record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(gender).equalToWhenPresent(record::getGender)
                .set(no).equalToWhenPresent(record::getNo)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(phone).equalToWhenPresent(record::getPhone)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(deleted).equalToWhenPresent(record::getDeleted)
                .set(departmentId).equalToWhenPresent(record::getDepartmentId)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified);
    }

    /**
     */
    default int updateByPrimaryKey(Employee record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(gender).equalTo(record::getGender)
            .set(no).equalTo(record::getNo)
            .set(password).equalTo(record::getPassword)
            .set(phone).equalTo(record::getPhone)
            .set(address).equalTo(record::getAddress)
            .set(status).equalTo(record::getStatus)
            .set(deleted).equalTo(record::getDeleted)
            .set(departmentId).equalTo(record::getDepartmentId)
            .set(gmtCreate).equalTo(record::getGmtCreate)
            .set(gmtModified).equalTo(record::getGmtModified)
            .where(id, isEqualTo(record::getId))
        );
    }

    /**
     */
    default int updateByPrimaryKeySelective(Employee record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(gender).equalToWhenPresent(record::getGender)
            .set(no).equalToWhenPresent(record::getNo)
            .set(password).equalToWhenPresent(record::getPassword)
            .set(phone).equalToWhenPresent(record::getPhone)
            .set(address).equalToWhenPresent(record::getAddress)
            .set(status).equalToWhenPresent(record::getStatus)
            .set(deleted).equalToWhenPresent(record::getDeleted)
            .set(departmentId).equalToWhenPresent(record::getDepartmentId)
            .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
            .set(gmtModified).equalToWhenPresent(record::getGmtModified)
            .where(id, isEqualTo(record::getId))
        );
    }
    
    default List<EmployeeVO> selectVO(SelectDSLCompleter completer) {
        BasicColumn[] selectVOList = Arrays.copyOf(selectList, selectList.length + 1);
        selectVOList[selectList.length] = DepartmentDynamicSqlSupport.name.as("departmentName");
        QueryExpressionDSL<SelectModel> start = SqlBuilder
            .select(selectVOList)
            .from(employee);
        return selectVOMany(MyBatis3Utils.select(start, completer));
    }
    
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="EmployeeVOResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="gender", property="gender", jdbcType=JdbcType.BIT),
        @Result(column="no", property="no", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.BIT),
        @Result(column="department_id", property="departmentId", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP), 
        @Result(column="departmentName", property="departmentName", jdbcType=JdbcType.TIMESTAMP)
    })
    List<EmployeeVO> selectVOMany(SelectStatementProvider selectStatement);
}