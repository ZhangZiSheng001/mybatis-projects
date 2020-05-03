package cn.zzs.mybatis.mapper;

import static cn.zzs.mybatis.mapper.RoleMenuDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.zzs.mybatis.entity.RoleMenu;
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
public interface RoleMenuMapper {
    BasicColumn[] selectList = BasicColumn.columnList(id, roleId, menuId);

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
    int insert(InsertStatementProvider<RoleMenu> insertStatement);

    /**
     * @param multipleInsertStatement
     * @return int
     */
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<RoleMenu> multipleInsertStatement);

    /**
     * @param selectStatement
     * @return Optional<RoleMenu>
     */
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RoleMenuResult")
    Optional<RoleMenu> selectOne(SelectStatementProvider selectStatement);

    /**
     * @param selectStatement
     * @return List<RoleMenu>
     */
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RoleMenuResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.VARCHAR),
        @Result(column="menu_id", property="menuId", jdbcType=JdbcType.VARCHAR)
    })
    List<RoleMenu> selectMany(SelectStatementProvider selectStatement);

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
        return MyBatis3Utils.countFrom(this::count, roleMenu, completer);
    }

    /**
     * @param completer
     */
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, roleMenu, completer);
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
    default int insert(RoleMenu record) {
        return MyBatis3Utils.insert(this::insert, record, roleMenu, c ->
            c.map(id).toProperty("id")
            .map(roleId).toProperty("roleId")
            .map(menuId).toProperty("menuId")
        );
    }

    /**
     */
    default int insertMultiple(Collection<RoleMenu> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, roleMenu, c ->
            c.map(id).toProperty("id")
            .map(roleId).toProperty("roleId")
            .map(menuId).toProperty("menuId")
        );
    }

    /**
     */
    default int insertSelective(RoleMenu record) {
        return MyBatis3Utils.insert(this::insert, record, roleMenu, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(roleId).toPropertyWhenPresent("roleId", record::getRoleId)
            .map(menuId).toPropertyWhenPresent("menuId", record::getMenuId)
        );
    }

    /**
     * @param completer
     */
    default Optional<RoleMenu> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, roleMenu, completer);
    }

    /**
     * @param completer
     */
    default List<RoleMenu> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, roleMenu, completer);
    }

    /**
     * @param completer
     */
    default List<RoleMenu> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, roleMenu, completer);
    }

    /**
     */
    default Optional<RoleMenu> selectByPrimaryKey(String id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    /**
     * @param completer
     */
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, roleMenu, completer);
    }

    /**
     */
    static UpdateDSL<UpdateModel> updateAllColumns(RoleMenu record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(roleId).equalTo(record::getRoleId)
                .set(menuId).equalTo(record::getMenuId);
    }

    /**
     */
    static UpdateDSL<UpdateModel> updateSelectiveColumns(RoleMenu record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(roleId).equalToWhenPresent(record::getRoleId)
                .set(menuId).equalToWhenPresent(record::getMenuId);
    }

    /**
     */
    default int updateByPrimaryKey(RoleMenu record) {
        return update(c ->
            c.set(roleId).equalTo(record::getRoleId)
            .set(menuId).equalTo(record::getMenuId)
            .where(id, isEqualTo(record::getId))
        );
    }

    /**
     */
    default int updateByPrimaryKeySelective(RoleMenu record) {
        return update(c ->
            c.set(roleId).equalToWhenPresent(record::getRoleId)
            .set(menuId).equalToWhenPresent(record::getMenuId)
            .where(id, isEqualTo(record::getId))
        );
    }
}