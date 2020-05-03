package cn.zzs.mybatis.mapper;

import java.sql.JDBCType;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EmployeeRoleDynamicSqlSupport {
    public static final EmployeeRole employeeRole = new EmployeeRole();

    /**
     * <p>主键</p>
     */
    public static final SqlColumn<String> id = employeeRole.id;

    /**
     * <p>用户id</p>
     */
    public static final SqlColumn<String> employeeId = employeeRole.employeeId;

    /**
     * <p>角色id</p>
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