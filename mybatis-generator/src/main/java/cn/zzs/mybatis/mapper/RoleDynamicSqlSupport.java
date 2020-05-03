package cn.zzs.mybatis.mapper;

import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class RoleDynamicSqlSupport {
    public static final Role role = new Role();

    /**
     * <p>角色id</p>
     */
    public static final SqlColumn<String> id = role.id;

    /**
     * <p>角色名称</p>
     */
    public static final SqlColumn<String> name = role.name;

    /**
     * <p>是否通用</p>
     */
    public static final SqlColumn<Boolean> isGeneral = role.isGeneral;

    /**
     * <p>记录是否已删除</p>
     */
    public static final SqlColumn<Boolean> deleted = role.deleted;

    /**
     * <p>记录创建时间</p>
     */
    public static final SqlColumn<Date> gmtCreate = role.gmtCreate;

    /**
     * <p>记录更新时间</p>
     */
    public static final SqlColumn<Date> gmtModified = role.gmtModified;

    public static final class Role extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> isGeneral = column("is_general", JDBCType.BIT);

        public final SqlColumn<Boolean> deleted = column("deleted", JDBCType.BIT);

        public final SqlColumn<Date> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public Role() {
            super("demo_role");
        }
    }
}