package cn.zzs.mybatis.mapper;

import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MenuDynamicSqlSupport {
    public static final Menu menu = new Menu();

    /**
     * <p>菜单id</p>
     */
    public static final SqlColumn<String> id = menu.id;

    /**
     * <p>父菜单id</p>
     */
    public static final SqlColumn<String> parentId = menu.parentId;

    /**
     * <p>菜单名</p>
     */
    public static final SqlColumn<String> name = menu.name;

    /**
     * <p>菜单先后</p>
     */
    public static final SqlColumn<Byte> order = menu.order;

    /**
     * <p>菜单url</p>
     */
    public static final SqlColumn<String> url = menu.url;

    /**
     * <p>是否父菜单</p>
     */
    public static final SqlColumn<Boolean> isParent = menu.isParent;

    /**
     * <p>记录是否已删除</p>
     */
    public static final SqlColumn<Boolean> deleted = menu.deleted;

    /**
     * <p>记录创建时间</p>
     */
    public static final SqlColumn<Date> gmtCreate = menu.gmtCreate;

    /**
     * <p>记录更新时间</p>
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