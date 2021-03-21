package cn.zzs.mybatis.mapper;

import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserDynamicSqlSupport {
    public static final User user = new User();

    /**
     * 用户id
     */
    public static final SqlColumn<String> id = user.id;

    /**
     * 用户名
     */
    public static final SqlColumn<String> name = user.name;

    /**
     * 性别
     */
    public static final SqlColumn<Boolean> gender = user.gender;

    /**
     * 用户年龄
     */
    public static final SqlColumn<Integer> age = user.age;

    /**
     * 记录创建时间
     */
    public static final SqlColumn<Date> gmtCreate = user.gmtCreate;

    /**
     * 记录最近修改时间
     */
    public static final SqlColumn<Date> gmtModified = user.gmtModified;

    /**
     * 是否删除
     */
    public static final SqlColumn<Boolean> deleted = user.deleted;

    /**
     * 电话号码
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