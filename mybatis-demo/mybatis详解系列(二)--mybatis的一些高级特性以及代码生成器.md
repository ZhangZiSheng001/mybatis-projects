# 简介

本来打算详细讲解 mybatis 的配置、映射器、动态 sql 等，但[Mybatis官方中文文档](https://Mybatis.org/Mybatis-3/zh/index.html/)对这部分内容的介绍已经非常全面了，有需要的可以直接参考。我将扩展一些重要的特性的内容，掌握它们可以更优雅、高效地使用 mybatis。

这里补充一点，本文的所有测试例子都是基于本系列 [Mybatis](https://www.cnblogs.com/ZhangZiSheng001/p/12603885.html) 第一篇文章的项目。

# 延迟加载

## 什么时候触发延迟加载

使用 mybatis 时通过以下这个配置，可以开启延迟加载，例如，查询员工对象时，只有调用了触发的方法，才会去执行查询部门或角色的 sql。

```xml
    <settings>
        <setting name="lazyLoadingEnabled" value="true" />
    </settings>
```

那么，延迟加载的触发方法有哪些呢？这就涉及到另外两个 setting，如下:

| 设置名                 | 描述                                                         | 有效值                 | 默认值                                       |
| :--------------------- | :----------------------------------------------------------- | :--------------------- | :------------------------------------------- |
| aggressiveLazyLoading | 开启时，几乎任一方法的调用都会加载该对象的所有延迟加载属性。 <br>否则，每个延迟加载属性会按需加载。 | true \| false | false （在 3.4.1 及之前的版本中默认为 true） |
| lazyLoadTriggerMethods | 指定对象的哪些方法触发一次延迟加载。 | 用逗号分隔的方法列表。 | equals,clone,hashCode,toString |

注意，这里的 lazyLoadTriggerMethods 只有在 aggressiveLazyLoading 为 false 才能生效。下面对比下不同的配置效果。

| aggressiveLazyLoading | lazyLoadTriggerMethods         | 效果                                                         |
| :-------------------- | :----------------------------- | :----------------------------------------------------------- |
| true                  | /                              | <font color='red'>员工类中任一方法</font>、equals、clone、hashCode、toString被调用，会触发延迟加 |
| false                 | equals,clone,hashCode,toString | <font color='red'>员工类中关联对象的setter/getter方法</font>、equals、clone、hashCode、toString被调用，会触发延迟加载 |
| false                 | equals                         | <font color='red'>员工类中关联对象的setter/getter方法</font>、equals被调用，会触发延迟加载 |

实际开发中，建议将 aggressiveLazyLoading 设置为 false，不然延迟加载就没有意义了。至于 lazyLoadTriggerMethods 保持默认就行，但在开发过程中要注意下 equals,clone,hashCode,toString 四个方法的使用。

## 有的延迟？有的不延迟

如果我希望部分关联对象不用延迟加载，部分关联对象又需要，例如，查询员工对象时，部门跟着查出来，而角色等到需要用的时候再加载。针对这种情况，可以在映射关系中使用 `fetchType`来覆盖延迟加载的开关状态：

```xml
		<association property="department" 
            column="department_id"
            fetchType="eager" 
            select="cn.zzs.mybatis.mapper.DepartmentMapper.selectByPrimaryKey" />
        <collection property="roles" 
            column="id" 
            select="cn.zzs.mybatis.mapper.RoleMapper.selectByEmployeeId" />
        <collection property="menus" 
            column="id" 
            select="cn.zzs.mybatis.mapper.MenuMapper.selectByEmployeeId" />
```

# 自动映射

## 开启自动映射

mybatis 的结果自动映射默认是开启的，可以在使用 setting 配置项进行修改，它有三种自动映射等级：

- `NONE` - 禁用自动映射。仅对手动映射的属性进行映射。
- `PARTIAL` - 对除在内部定义了嵌套结果映射（也就是连接的属性）以外的属性进行映射。默认配置。
- `FULL` - 自动映射所有属性。

默认使用 PARTIAL，另外， 无论设置的自动映射等级是哪种，你都可以通过在映射文件中设置 resultMap 的 `autoMapping` 属性来为指定的结果映射设置启用/禁用自动映射。 

```xml
    <resultMap id="BaseResultMap2" type="Employee" autoMapping="true">
        <id column="id" property="id" javaType="string" jdbcType="VARCHAR" />
    </resultMap>
```

## 自动映射驼峰命名的属性

当自动映射查询结果时，MyBatis 会获取结果中返回的列名并在 Java 类中查找相同名字的属性（忽略大小写）。如果列名和实体中的属性名对不上，则需要显式地配置。在使用例子中，我们使用`resultMap`来映射表和对象，如下：

```xml
    <!-- 基础映射表 -->
    <resultMap id="BaseResultMap" type="cn.zzs.mybatis.entity.Employee">
        <id column="id" property="id" javaType="string" jdbcType="VARCHAR" />
        <result column="department_id" property="departmentId" javaType="string" jdbcType="VARCHAR" />
        <result column="gmt_create" property="create" javaType="date" jdbcType="TIMESTAMP" />
        <result column="gmt_modified" property="modified" javaType="date" jdbcType="TIMESTAMP" />
    </resultMap>
    <!-- 基础字段 -->
    <sql id="Base_Column_List">
        e.id,
        e.`name`,
        e.gender,
        e.no,
        e.password,
        e.phone,
        e.address,
        e.status,
        e.deleted,
        e.department_id,
        e.gmt_create,
        e.gmt_modified
    </sql>
    <!-- 根据id查询 -->
    <select id="selectByPrimaryKey" parameterType="java.lang.String" resultMap="BaseResultMap">
        select
        <include refid="Base_Column_List" />
        from
        demo_employee e
        where
        e.id = #{id}
    </select>
```

除了表列名和实体的属性名一致的情况，其他的字段都需要我们手动配置映射，这样做比较麻烦。但是，大部分情况下，我们都会遵循驼峰命名的规则来定义实体的属性名，是否可以直接通过这种规则来自动映射呢？

mybatis 提供了`mapUnderscoreToCamelCase`配置项来处理这种情况。

```xml
    <settings>
        <setting name="mapUnderscoreToCamelCase" value="true" />
    </settings>
```

# 执行器




# 滚动策略




# 参考资料

[Mybatis官方中文文档](https://Mybatis.org/Mybatis-3/zh/index.html/)

> 相关源码请移步：[mybatis-demo](https://github.com/ZhangZiSheng001/mybatis-projects/tree/master/mybatis-demo)

> 本文为原创文章，转载请附上原文出处链接：[https://www.cnblogs.com/ZhangZiSheng001/p/12603885.html](https://www.cnblogs.com/ZhangZiSheng001/p/12603885.html)

 