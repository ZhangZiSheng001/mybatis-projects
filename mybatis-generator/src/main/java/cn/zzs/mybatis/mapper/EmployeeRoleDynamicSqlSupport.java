package cn.zzs.mybatis.mapper;

import java.sql.JDBCType;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EmployeeRoleDynamicSqlSupport {
    public static final EmployeeRole employeeRole = new EmployeeRole();

    /**
     * 主键
     */
    public static final SqlColumn<String> id = employeeRole.id;

    /**
     * 用户id
     */
    public static final SqlColumn<String> employeeId = employeeRole.employeeId;

    /**
     * 角色id
     */
    public static final SqlColumn<String> roleId = employeeRole.roleId;

    public static final class EmployeeRole extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> employeeId = column("employee_id", JDBCType.VARCHAR);

        public final SqlColumn<String> roleId = column("role_id", JDBCType.VARCHAR);

        public EmployeeRole() {
            super("demo_employee_role");
        }
    }
}