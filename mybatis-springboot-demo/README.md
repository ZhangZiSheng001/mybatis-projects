# mybatis-springboot-demo

## 简介
`Mybatis`是一个持久层框架，相比`Hibernate`（面向Code），更面向DB，可以灵活地对`sql`语句进行优化。它封装了`JDBC`访问数据库的过程，整合连接池，并提供了事务机制。  

`Mybatis`利用动态代理自动实现`Mapper`接口，而且这种方式可以利用逆向工程生成实体和单表CRUD的接口和xml，非常方便。我们开发时只需专注如何拼装`sql`语句，其它复杂的过程全部可以交给`Mybatis`去完成。 

使用`SpringBoot`整合`Mybatis`主要需掌握以下内容：  

1. `application.properties`的配置；  

2. `mapper`的配置：`select`、`insert`、`update`、`delete`、`resultMap`、`sql`、动态sql（`where`、`if`、`trim`、`for each`）；  

3. `mapper`的一对多和多对多、自关联的配置；  

4. `Mapper`的`API`使用；  

5. 逆向工程  

## 需求
采用`Spring Boot`整合`Mybatis`针对以下三个实体进行增删改查操作：  

1. 用户：  

2. 角色：和用户是一对多关系  

3. 菜单：和角色是多对多关系，本身自关联 

## 工程环境
JDK：1.8.0_201  

maven：3.6.1  

IDE：Spring Tool Suites4 for Eclipse 4.12  

mysql：5.7  

mybatis：3.5.2  

SpringBoot：2.1.7.RELEASE  

## 依赖引入
这里采用c3p0连接池。

```xml
<parent>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-parent</artifactId>
	<version>2.1.7.RELEASE</version>
	<relativePath /> <!-- lookup parent from repository -->
</parent>

<properties>
	<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
	<java.version>1.8</java.version>
</properties>

<dependencies>
	<!-- mybatis-starter -->
	<dependency>
		<groupId>org.mybatis.spring.boot</groupId>
		<artifactId>mybatis-spring-boot-starter</artifactId>
		<version>2.1.0</version>
	</dependency>
	<!-- test-starter -->
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-test</artifactId>
		<scope>test</scope>
	</dependency>
	<!-- pagehelper-starter -->
	<dependency>
		<groupId>com.github.pagehelper</groupId>
		<artifactId>pagehelper-spring-boot-starter</artifactId>
		<version>1.2.12</version>
	</dependency>
	<!-- mysql驱动 -->
	<dependency>
		<groupId>mysql</groupId>
		<artifactId>mysql-connector-java</artifactId>
	</dependency>
	<!-- 连接池 -->
	<dependency>
		<groupId>com.mchange</groupId>
		<artifactId>c3p0</artifactId>
		<version>0.9.5.4</version>
	</dependency>
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-configuration-processor</artifactId>
		<optional>true</optional>
	</dependency>
</dependencies>
```

## application.properties的配置
关于这个文件的配置，其实还有很多选项，只是常用的就下面这几个。数据源我想让它做到自动加载配置文件，所以在`Configuration`类中配置。  
  
```properties
# datasource：这个我选择在Configuration类中配置c3p0，可以直接读取文件

# mybatis
mybatis.type-aliases-package=cn.zzs.mybatis.pojo
mybatis.mapper-locations=classpath:cn/zzs/mybatis/mapper/*.xml
mybatis.configuration.map-underscore-to-camel-case=true

# pagehelper分页插件配置
pagehelper.helperDialect=mysql
pagehelper.reasonable=true
pagehelper.supportMethodsArguments=true
pagehelper.params=count=countSql
```
c3p0的配置  
本来想在`application.properties`中配置数据源的全路径类名就行了，但保存说要连接参数，目前只能用`DataSourceConfig`方式来处理。  

```java
/**
 * @ClassName: DataSourceConfig
 * @Description: 配置数据库连接池
 * @author: zzs
 * @date: 2019年9月4日 下午3:45:32
 */
@Configuration
public class DataSourceConfig {
	//指定当前对象作为bean
	@Bean(name = "dataSource")
	//指定dataSource来DI
	@Qualifier(value = "dataSource")
	//primary将当前数据库连接池作为默认数据库连接池
	//@Primary
	public DataSource dataSource() {
		return new ComboPooledDataSource();
	}
}
```

## *mapper.xml的配置
项目中的mapper.xml、Mapper接口和实体类都是逆向工程生成（sql脚本在项目中已给出，可以按此使用mybatis-generator生成）。生成的Mapper几乎包含了单表操作的所有方法，我们只要在这个基础上配置多表关系就行了。  

### 多方的配置
这里是按主键查询的情况，如果是按Example查询的话，项目中也有，这里不再列出。  

```xml
<!-- 关联查询角色的ResultMap -->
<resultMap id="UserRoleResultMap" type="User">
  <id property="id" column="user_id" />
  <result property="name"  column="user_name"/>
  <result property="age" column="user_age"/>
  <result property="create" column="gmt_create"/>
  <result property="modified" column="gmt_modified"/>
  <result property="roleId" column="user_role_id"/>
  <association property="role" javaType="role">
       <id property="id" column="role_id"/>
      <result property="name" column="role_name"/>
      <result property="create" column="gmt_create"/>
      <result property="modified" column="gmt_modified"/>
  </association>
</resultMap>
<!-- 根据id查询用户并查询角色 -->
<select id="selectRelatedRoleByPrimaryKey" parameterType="java.lang.Long" resultMap="UserRoleResultMap">
  SELECT 
<include refid="Related_Role_Column_List" />
	FROM
	  `mybatis_user` u,`mybatis_role` r 
	WHERE 
	  u.`user_role_id` = r.`role_id` 
	AND
	  u.`user_id` = #{id,jdbcType=BIGINT}
</select>
```

### 一方配置
多方和一方其实配置差不多，关键在resultMap里一方时`collection`，而多方是`association`。 

```xml
<!-- 关联查询User的ResultMap -->
<resultMap id="RoleUserResultMap" type="Role">
  <id property="id" column="role_id"/>
  <result property="name" column="role_name"/>
  <result property="create" column="gmt_create"/>
  <result property="modified" column="gmt_modified"/>
  <collection property="users" ofType="User">
      <id property="id" column="user_id" />
      <result property="name"  column="user_name"/>
      <result property="age" column="user_age"/>
      <result property="create" column="gmt_create"/>
      <result property="modified" column="gmt_modified"/>
      <result property="roleId" column="role_id"/>
  </collection>
</resultMap>

<!-- 根据id查询角色并查询用户 -->
<select id="selectRelatedUserByPrimaryKey" parameterType="java.lang.Long" resultMap="RoleUserResultMap">
  SELECT 
<include refid="Related_User_Column_List" />
    FROM
      `mybatis_user` u,`mybatis_role` r 
    WHERE 
      u.`user_role_id` = r.`role_id` 
    AND
      r.`role_id` = #{id,jdbcType=BIGINT}
</select>
```

### 菜单树的自关联查询
本质上是利用递归来查询所有菜单。关键还是在resultMap中的配置。  

```xml
<!-- 菜单管理子菜单查询的ResultMap -->
<resultMap id="MenuMenuResultMap" type="Menu">
  <id property="id" column="menu_id" />
  <result property="create"  column="gmt_create"/>
  <result property="modified" column="gmt_modified"/>
  <result property="name" column="menu_name"/>
  <result property="order" column="menu_order"/>
  <result property="url" column="menu_url"/>
  <result property="parentId" column="menu_parent_id"/>
  <collection property="children" ofType="Menu" column="menu_id" select="findMenuByParentId"/>
</resultMap> 

<!-- 查询根菜单并返回子菜单 -->
<select id="selectRootRelatedChildren" resultMap="MenuMenuResultMap">
SELECT  
<include refid="Base_Column_List" />
FROM `mybatis_menu` WHERE `menu_parent_id` = '' or `menu_parent_id` is NULL
</select>

<!-- 根据parentId查询菜单并返回子菜单 -->
<select id="findMenuByParentId" parameterType="String" resultMap="MenuMenuResultMap">
   SELECT  
   <include refid="Base_Column_List" />
   from `mybatis_menu` where `menu_parent_id` = #{value}
</select>
```
## 启动类的配置
这里要配置好Mapper的扫描包
```java
/**
 * @Description
 * @Author zzs
 * @Date 2018-05-02 14:51
 */
@SpringBootApplication
@MapperScan("cn.zzs.mybatis.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
```

## Mapper的使用
注意，逆向工程生成的mapper中只会包含基本的方法，如果我们要自定义方法，需要在Mapper接口中给出。另外，mapper.xml也必须配置好方法对应的sql。  

```java
/**
 * @ClassName: UserMapperTest
 * @Description: 测试UserMapper
 * @author: zzs
 * @date: 2019年9月2日 上午11:59:11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { Application.class })
public class UserMapperTest {
	@Autowired
	private UserMapper userMapper;

	/**
	 * 测试添加
	 */
	@Test
	@Transactional
	@Rollback(false)
	public void testSave() {
		//创建用户
		User user = new User(18, new Date(), new Date(), "zzf006");
		//设置角色
		user.setRoleId(1L);
		//保存
		userMapper.insert(user);
		//userMapper.insertSelective(new User(18, new Date(), new Date(), "zzs001"));
	}
}
```

## 分页插件的使用
注意，使用分页插件前提要在pom文件中引入`pageHelper`的依赖，并且在`application.properties`中配置好相关参数。  

```java
	/**
	 * 测试分页插件
	 */
	@Test
	@Transactional(readOnly = true)
	@Rollback(false)	
	public void testPageHelper() {
		//设置分页信息
		PageHelper.startPage(0, 3);
		//执行查询
		List<User> list = userMapper.selectByExample(null);
		//遍历结果
		Iterator<User> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.err.println(iterator.next());
		}
		//封装分页模型
		PageInfo<User> pageInfo = new PageInfo<>(list);
		//取分页模型的数据
		System.err.println("查询总数" + pageInfo.getTotal());
	}
```	

## Mybatis的原理
通过源码分析，`Mybatis`的`sqlSession`在执行数据库操作时，会利用`Configuration`配置对象获得`MappedStatement`对象（方法和执行语句的Map），根据这个对象`Executor`执行器对象完成传入参数的处理、语句的执行和结果集的封装。 
![mybatis原理图](https://github.com/ZhangZiSheng001/mybatis-projects/blob/master/mybatis-demo/img/mybatis%E5%8E%9F%E7%90%86%E5%9B%BE.jpg?raw=true)

## 项目路径
测试单独使用Mybatis对数据库进行增删改查  
[mybatis-demo](https://github.com/ZhangZiSheng001/mybatis-projects/tree/master/mybatis-demo)  

测试Spring整合Mybatis对数据库进行增删改查  
[mybatis-spring-demo](https://github.com/ZhangZiSheng001/mybatis-projects/tree/master/mybatis-spring-demo)  

测试SpringBoot整合Mybatis对数据库进行增删改查  
[mybatis-springboot-demo](https://github.com/ZhangZiSheng001/mybatis-projects/tree/master/mybatis-springboot-demo)  

逆向工程   
[mybatis-generator](https://github.com/ZhangZiSheng001/mybatis-projects/tree/master/mybatis-generator)  

> 学习使我快乐！！
