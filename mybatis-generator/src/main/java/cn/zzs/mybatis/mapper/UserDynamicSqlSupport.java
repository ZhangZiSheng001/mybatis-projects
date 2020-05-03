package cn.zzs.mybatis.mapper;

import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserDynamicSqlSupport {
    public static final User user = new User();

    /**
     * <p>用户id</p>
     */
    public static final SqlColumn<String> id = user.id;

    /**
     * <p>用户名</p>
     */
    public static final SqlColumn<String> name = user.name;

    /**
     * <p>性别</p>
     */
    public static final SqlColumn<Boolean> gender = user.gender;

    /**
     * <p>用户年龄</p>
     */
    public static final SqlColumn<Integer> age = user.age;

    /**
     * <p>记录创建时间</p>
     */
    public static final SqlColumn<Date> gmtCreate = user.gmtCreate;

    /**
     * <p>记录最近修改时间</p>
     */
    public static final SqlColumn<Date> gmtModified = user.gmtModified;

    /**
     * <p>是否删除</p>
     */
    public static final SqlColumn<Boolean> deleted = user.deleted;

    /**
     * <p>电话号码</p>
     */
    public static final SqlColumn<String> phone = user.phone;

    public static final class User extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> gender = column("gender", JDBCType.BIT);

        public final SqlColumn<Integer> age = column("age", JDBCType.INTEGER);

        public final SqlColumn<Date> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public final SqlColumn<Boolean> deleted = column("deleted", JDBCType.BIT);

        public final SqlColumn<String> phone = column("phone", JDBCType.VARCHAR);

        public User() {
            super("demo_user");
        }
    }
}