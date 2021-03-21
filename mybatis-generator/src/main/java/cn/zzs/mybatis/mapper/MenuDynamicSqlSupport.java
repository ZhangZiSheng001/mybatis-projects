package cn.zzs.mybatis.mapper;

import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MenuDynamicSqlSupport {
    public static final Menu menu = new Menu();

    /**
     * 菜单id
     */
    public static final SqlColumn<String> id = menu.id;

    /**
     * 父菜单id
     */
    public static final SqlColumn<String> parentId = menu.parentId;

    /**
     * 菜单名
     */
    public static final SqlColumn<String> name = menu.name;

    /**
     * 菜单先后
     */
    public static final SqlColumn<Byte> order = menu.order;

    /**
     * 菜单url
     */
    public static final SqlColumn<String> url = menu.url;

    /**
     * 是否父菜单
     */
    public static final SqlColumn<Boolean> isParent = menu.isParent;

    /**
     * 记录是否已删除
     */
    public static final SqlColumn<Boolean> deleted = menu.deleted;

    /**
     * 记录创建时间
     */
    public static final SqlColumn<Date> gmtCreate = menu.gmtCreate;

    /**
     * 记录更新时间
     */
    public static final SqlColumn<Date> gmtModified = menu.gmtModified;

    public static final class Menu extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> parentId = column("parent_id", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Byte> order = column("order", JDBCType.TINYINT);

        public final SqlColumn<String> url = column("url", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> isParent = column("is_parent", JDBCType.BIT);

        public final SqlColumn<Boolean> deleted = column("deleted", JDBCType.BIT);

        public final SqlColumn<Date> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public Menu() {
            super("demo_menu");
        }
    }
}