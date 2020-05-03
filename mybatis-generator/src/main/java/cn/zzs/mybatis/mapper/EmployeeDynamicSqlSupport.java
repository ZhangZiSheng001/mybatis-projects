package cn.zzs.mybatis.mapper;

import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EmployeeDynamicSqlSupport {
    public static final Employee employee = new Employee();

    /**
     * <p>员工id</p>
     */
    public static final SqlColumn<String> id = employee.id;

    /**
     * <p>员工姓名</p>
     */
    public static final SqlColumn<String> name = employee.name;

    /**
     * <p>员工性别 0表示女，1表示男</p>
     */
    public static final SqlColumn<Boolean> gender = employee.gender;

    /**
     * <p>员工工号</p>
     */
    public static final SqlColumn<String> no = employee.no;

    /**
     * <p>员工密码</p>
     */
    public static final SqlColumn<String> password = employee.password;

    /**
     * <p>员工手机电话</p>
     */
    public static final SqlColumn<String> phone = employee.phone;

    /**
     * <p>员工住址</p>
     */
    public static final SqlColumn<String> address = employee.address;

    /**
     * <p>员工状态 0为禁用,1为启用,2为冻结</p>
     */
    public static final SqlColumn<Byte> status = employee.status;

    /**
     * <p>记录是否已删除</p>
     */
    public static final SqlColumn<Boolean> deleted = employee.deleted;

    /**
     * <p>员工所属部门id</p>
     */
    public static final SqlColumn<String> departmentId = employee.departmentId;

    /**
     * <p>记录创建时间</p>
     */
    public static final SqlColumn<Date> gmtCreate = employee.gmtCreate;

    /**
     * <p>记录更新时间</p>
     */
    public static final SqlColumn<Date> gmtModified = employee.gmtModified;

    public static final class Employee extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> gender = column("gender", JDBCType.BIT);

        public final SqlColumn<String> no = column("no", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<String> phone = column("phone", JDBCType.VARCHAR);

        public final SqlColumn<String> address = column("address", JDBCType.VARCHAR);

        public final SqlColumn<Byte> status = column("status", JDBCType.TINYINT);

        public final SqlColumn<Boolean> deleted = column("deleted", JDBCType.BIT);

        public final SqlColumn<String> departmentId = column("department_id", JDBCType.VARCHAR);

        public final SqlColumn<Date> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public Employee() {
            super("demo_employee");
        }
    }
}