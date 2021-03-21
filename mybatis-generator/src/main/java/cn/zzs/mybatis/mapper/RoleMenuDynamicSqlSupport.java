package cn.zzs.mybatis.mapper;

import java.sql.JDBCType;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class RoleMenuDynamicSqlSupport {
    public static final RoleMenu roleMenu = new RoleMenu();

    /**
     * 主键
     */
    public static final SqlColumn<String> id = roleMenu.id;

    /**
     * 角色id
     */
    public static final SqlColumn<String> roleId = roleMenu.roleId;

    /**
     * 菜单id
     */
    public static final SqlColumn<String> menuId = roleMenu.menuId;

    public static final class RoleMenu extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> roleId = column("role_id", JDBCType.VARCHAR);

        public final SqlColumn<String> menuId = column("menu_id", JDBCType.VARCHAR);

        public RoleMenu() {
            super("demo_role_menu");
        }
    }
}