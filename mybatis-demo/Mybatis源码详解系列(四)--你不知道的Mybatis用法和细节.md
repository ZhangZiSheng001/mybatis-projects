# 简介

这是 [Mybatis]( https://www.cnblogs.com/ZhangZiSheng001/category/1685176.html ) 系列博客的第四篇，我本来打算详细讲解 mybatis 的配置、映射器、动态 sql 等，但[Mybatis官方中文文档](https://mybatis.org/mybatis-3/zh/index.html)对这部分内容的介绍已经足够详细了，有需要的可以直接参考。所以，我将扩展一些其他特性或使用细节，掌握它们可以更优雅、高效地使用 mybatis。

这里补充一点，本文的所有测试例子都是基于本系列 [Mybatis]( https://www.cnblogs.com/ZhangZiSheng001/category/1685176.html ) 第一篇文章的项目，相关博客如下：

 [Mybatis源码详解系列(一)--持久层框架解决了什么及如何使用Mybatis](https://www.cnblogs.com/ZhangZiSheng001/p/12603885.html) 

 [Mybatis源码详解系列(二)--Mybatis如何加载配置及初始化](https://www.cnblogs.com/ZhangZiSheng001/p/12704076.html) 

 [Mybatis源码详解系列(三)--从Mapper接口开始看Mybatis的执行逻辑](https://www.cnblogs.com/ZhangZiSheng001/p/12761376.html) 

# 结果处理器--ResultHandler

在分析源码时，我们提到过 ResultHandler 这个接口，当 Mapper 接口的入参列表中包含 ResultHandler 且返回类型为 void 时（如下代码），mybatis 会这样处理：每映射完一个 Employee 对象，都会将这个 Employee 对象传入 ResultHandler 中。也就是说，通过 ResultHandler，我们可以对传进来的 Employee 对象进行任意处理。

```java
void queryByCondition(@Param("con") EmployeeCondition condition, ResultHandler<Employee> resultHandler);
```

这里我提供了一个 ResultHandler 实现类的示例：

```java
public class EmployeeVOResultHandler implements ResultHandler<Employee> {

    private List<EmployeeVO> VOs = new ArrayList<>();

    @Override
    public void handleResult(ResultContext<? extends Employee> resultContext) {
        // 获取Employee
        Employee employee = resultContext.getResultObject();

        // 转换为EmployeeVO
        EmployeeVO employeeVO = BeanUtils.copy(employeeVO, EmployeeVO.class);

        // 添加到结果列表
        VOs.add(employeeVO);
    }

    public List<EmployeeVO> getResults() {
        return VOs;
    }
}
```

我认为，**官方之所以提供 ResultHandler，是考虑到 resultMap 也有映射不了的对象而做的补充**。所以，当我们遇到 resultMap 也映射不了的对象时，可以考虑使用 ResultHandler。

# 分页不需要插件--RowBounds

在使用篇中，我们使用 pagehelper 来支持分页功能，其实，mybatis 已经自带了分页功能。和 ResultHandler 一样，我们只需要改造下 Mapper 接口，如下：

```java
List<Employee> queryByCondition(@Param("con") EmployeeCondition condition, RowBounds rowBounds);
```

RowBounds 中指定好结果的范围，mybatis 就会帮我们自动分页。

```java
    @Test
    public void testRowBounds() {
        // 创建RowBounds
        RowBounds rowBounds = new RowBounds(0, 3);
        
        // 构建条件
        EmployeeCondition con = new EmployeeCondition();
        con.setDeleted(0);
        
        // 执行查询
        List<Employee> employees = employeeMapper.queryByCondition(con, rowBounds);
        
        // 测试
        assertTrue(!CollectionUtils.isEmpty(employees));
        employees.stream().forEach(System.err::println);
    }
```

相比使用插件，这种方式不是更简单吗？那么，我为什么还要使用插件呢？其实，当我们看到控制台打印的 sql，就应该知道原因了（注意，使用 RowBounds 时记得把分页插件的配置注释掉）：

```powershell
==>  Preparing: select e.id,e.`name`,e.gender,e.no,e.password,e.phone,e.address,e.status,e.deleted,e.department_id,e.gmt_create,e.gmt_modified from demo_employee e where 1 = 1 and e.deleted = ? 
==> Parameters: 0(Integer)
Employee [id=2e18f6560b25473480af987141eccd02, name=zzs005, gender=1, no=zzs005, password=admin, phone=18826****41, address=广东, status=1, deleted=0, departmentId=94e2d2e56cd811ea802000fffc35d9fa, gmtCreate=Sat Mar 28 00:00:00 CST 2020, gmtModified=Sat Mar 28 00:00:00 CST 2020]
Employee [id=cc6b08506cdb11ea802000fffc35d9fa, name=zzs001, gender=1, no=zzs001, password=666666, phone=18826****42, address=北京, status=1, deleted=0, departmentId=65684a126cd811ea802000fffc35d9fa, gmtCreate=Wed Sep 04 21:48:28 CST 2019, gmtModified=Wed Mar 25 10:44:51 CST 2020]
Employee [id=cc6b08506cdb11ea802000fffc35d9fb, name=zzs002, gender=1, no=zzs002, password=123456, phone=18826****43, address=广东, status=1, deleted=0, departmentId=65684a126cd811ea802000fffc35d9fa, gmtCreate=Thu Aug 01 21:49:43 CST 2019, gmtModified=Mon Sep 02 21:49:49 CST 2019]
```

我们发现，**mybatis 使用 RowBounds 进行分页，本质上是把所有数据查出来，再放到应用内存里分页，这种方式非常耗性能和内存**。所以，RowBounds 了解一下就可以了，实际项目中分页还是考虑引入插件吧。

# 延迟加载

## 延迟加载失效了吗

在使用篇中，当使用嵌套 select 查询时，我们通过配置 lazyLoadingEnabled 来开启延迟加载。

```xml
    <settings>
        <setting name="lazyLoadingEnabled" value="true" />
    </settings>
```

按理来说，只有我调用了 getDepartment 时，才会触发查询部门的操作，不调用的话永远都不会触发。而实际上真的是这样吗？下面的方法中，我们把 getDepartment 注释掉。

```java
    @Test
    public void testLazyLoading() throws Exception {
        // 先查员工
        Employee employee = employeeMapper.queryById("cc6b08506cdb11ea802000fffc35d9fe");
        
        // 获取部门
        // Department department = employee.getDepartment();
        
        // 测试
        System.err.println(employee);
    }
```

运行测试，控制台中竟然打印了查询部门的 sql。说好的延迟加载呢？

```powershell
==>  Preparing: select e.* from demo_employee e where e.id = ? 
==> Parameters: cc6b08506cdb11ea802000fffc35d9fe(String)
<==      Total: 1
==>  Preparing: select r.* from demo_role r, demo_employee_role er where er.role_id = r.id and er.employee_id = ? and r.deleted = 0 
==> Parameters: cc6b08506cdb11ea802000fffc35d9fe(String)
<==      Total: 2
==>  Preparing: select d.* from demo_department d where d.id = ? 
==> Parameters: 65684a126cd811ea802000fffc35d9fa(String)
<==      Total: 1
Employee [id=cc6b08506cdb11ea802000fffc35d9fe, name=zzf001, gender=0, no=zzf001, password=123456, phone=18826****41, address=北京, status=1, deleted=0, departmentId=65684a126cd811ea802000fffc35d9fa, gmtCreate=Wed Sep 04 21:54:49 CST 2019, gmtModified=Wed Sep 04 21:54:51 CST 2019]
```

## 什么时候触发延迟加载

在上面的例子中，难道延迟加载失效了吗？

其实并没有，根本原因就在于，**mybatis 认为，toString 里会用到 department 字段，所以触发了查询部门。同理，equals、clone、hashCode 也是一样**。而事实上，我们项目中使用的 Employee 的 toString 方法并没有用到 department。

那么，我们如何改变这种行为呢？mybatis 提供了以下配置项：

| 配置项名              | 描述                                         | 有效值               | 默认值                         |
| :--------------------- | :------------------------------------------- | :------------------- | :----------------------------- |
| lazyLoadTriggerMethods | 指定哪些方法触发加载该对象的所有延迟加载属性 | 用逗号分隔的方法列表 | equals,clone,hashCode,toString |
| aggressiveLazyLoading | 开启时，几乎**任一方法**的调用都会加载该对象的所有延迟加载属性。 <br>否则，每个延迟加载属性会按需加载。 | true \| false | false （在 3.4.1 及之前的版本中默认为 true） |

我们将配置修改如下：

```xml
    <settings>
        <setting name="lazyLoadingEnabled" value="true" />
        <setting name="aggressiveLazyLoading" value="false" />
        <setting name="lazyLoadTriggerMethods" value="equals,clone,hashCode" />
    </settings>
```

再次测试上面的例子。这时，嵌套对象就没有被加载出来了。

```powershell
==>  Preparing: select e.* from demo_employee e where e.id = ? 
==> Parameters: cc6b08506cdb11ea802000fffc35d9fe(String)
<==      Total: 1
Employee [id=cc6b08506cdb11ea802000fffc35d9fe, name=zzf001, gender=0, no=zzf001, password=123456, phone=18826****41, address=北京, status=1, deleted=0, departmentId=65684a126cd811ea802000fffc35d9fa, gmtCreate=Wed Sep 04 21:54:49 CST 2019, gmtModified=Wed Sep 04 21:54:51 CST 2019]
```


作为延迟加载部分的总结，这里对比下不同配置项组合的效果：

| aggressiveLazyLoading | lazyLoadTriggerMethods         | 效果                                                         |
| :-------------------- | :----------------------------- | :----------------------------------------------------------- |
| true                  | /                              | <font color='red'>员工类中任一方法</font>、equals、clone、hashCode、toString被调用，会触发延迟加 |
| false                 | equals,clone,hashCode,toString | <font color='red'>员工类中关联对象的getter方法</font>、equals、clone、hashCode、toString被调用，会触发延迟加载 |
| false                 | equals                         | <font color='red'>员工类中关联对象的getter方法</font>、equals被调用，会触发延迟加载 |

## 有的延迟？有的不延迟

如果我希望部分关联对象不用延迟加载，部分关联对象又需要，例如，查询员工对象时，部门跟着查出来，而角色等到需要用的时候再加载。针对这种情况，可以使用  fetchType 来覆盖全局配置：

```xml
    <resultMap id = "EmployResultMap" type = "cn.zzs.mybatis.entity.Employee">
        <result column="id" property="id"/>
        <result column="department_id" property="departmentId"/>
        <association 
            fetchType="eager"
            property="department" 
            column="department_id" 
            select="cn.zzs.mybatis.mapper.DepartmentMapper.queryById"/>
        <collection 
            property="roles"
            column="id"
            select="cn.zzs.mybatis.mapper.RoleMapper.queryByEmployeeId"
            />
    </resultMap>
```

# 自动映射

mybatis 的结果集自动映射默认是开启的，可以使用 setting 配置项进行修改：

具体配置方式如下：

```java
    <settings>
        <setting name="autoMappingBehavior" value="PARTIAL"/>
    </settings>
```

它有三种自动映射等级：

- `NONE` - 禁用自动映射。也就是说你需要在 resultMap 中把所有字段都罗列出来。
- `FULL` - 自动映射所有属性。这种等级配合 mapUnderscoreToCamelCase，几乎可以自动完成所有字段的映射。
- `PARTIAL` - 通常情况下和 FULL 一样。但是，如果你的 resultMap 中存在嵌套结果集映射，那么，mybatis 只会自动映射嵌套结果集里的字段，而外层的字段就不管了，你需要手动一个个地映射。

```xml
    <resultMap id = "EmployResultMap2" type = "cn.zzs.mybatis.entity.Employee">
        <association  property="department">
            <result column="departmentName" property="name"/>
            <result column="departmentNo" property="no"/>
        </association>
    </resultMap>
    
    
    <select id = "queryById2" parameterType = "string" resultMap = "EmployResultMap2">
        select e.*, d.name as departmentName, d.no as departmentNo 
        from demo_employee e left join demo_department d on e.department_id = d.id 
        where e.id = #{value}
    </select>
```

上面的 xml 中，如果你的自动映射等级为 PARTIAL，则会出现这样的结果：

```powershell
==>  Preparing: select e.*, d.name as departmentName, d.no as departmentNo from demo_employee e left join demo_department d on e.department_id = d.id where e.id = ? 
==> Parameters: cc6b08506cdb11ea802000fffc35d9fe(String)
<==      Total: 1
Employee [id=null, name=null, gender=null, no=null, password=null, phone=null, address=null, status=null, deleted=null, departmentId=null, gmtCreate=null, gmtModified=null]
```

所以，**我强烈建议自动映射等级配置为 FULL**。

另外， 无论是否在全局开启了自动映射，你都可以通过 autoMapping 属性进行覆盖。 

```xml
    <resultMap id="BaseResultMap2" type="Employee" autoMapping="true">
    </resultMap>
```

# 结语

以上补充了一些 mybatis 的“彩蛋”，后续发现其他有趣的地方还会继续补充，也欢迎大家指正不足的地方。

最后，感谢阅读。

# 参考资料

[Mybatis官方中文文档](https://mybatis.org/mybatis-3/zh/index.html)

> 2021-10-02更改

> 相关源码请移步：[mybatis-demo](https://github.com/ZhangZiSheng001/mybatis-projects/tree/master/mybatis-demo)

> 本文为原创文章，转载请附上原文出处链接：[https://www.cnblogs.com/ZhangZiSheng001/p/12773971.html ]( https://www.cnblogs.com/ZhangZiSheng001/p/12773971.html )

 