# mybatis-projects

## 简介
`Mybatis`是一个持久层框架，相比`Hibernate`（面向Code），更面向DB，可以灵活地对`sql`语句进行优化。它封装了`JDBC`访问数据库的过程，整合连接池，并提供了事务机制。  

`Mybatis`利用动态代理自动实现`Mapper`接口，而且这种方式可以利用逆向工程生成代码，非常方便。我们开发时只需专注如何拼装`sql`语句，其它复杂的过程全部可以交给`Mybatis`去完成。  

使用`Mybatis`主要需掌握以下内容：  

1. `config`的配置：主要为`typeAliases`、`plugins`、`environments`、`mappers`等；  

2. `mapper`的配置：`select`、`insert`、`update`、`delete`、`resultMap`、`sql`、动态sql（`where`、`if`、`trim`、`for each`）；  

3. `mapper`的一对多和多对多、自关联的配置；  

4. `SqlSession`和`Mapper`的`API`使用；  

5. 逆向工程  

## 需求
采用`Mybatis`针对三个实体进行增删改查操作：  

1. 用户：  

2. 角色：和用户是一对多关系  

3. 菜单：和角色是多对多关系，本身自关联 

## 工程环境
JDK：1.8.0_201  
maven：3.6.1  
IDE：Spring Tool Suites4 for Eclipse 4.12  
mysql：5.7
mybatis：3.5.2

## 依赖引入
`Mybatis`有自带的连接池，所以不需要引入连接池的坐标。当然我们也可以使用其他连接池。  

```xml
<dependency>
	<groupId>junit</groupId>
	<artifactId>junit</artifactId>
	<version>4.12</version>
	<scope>test</scope>
</dependency>
<!-- mybatis -->
<dependency>
	<groupId>org.mybatis</groupId>
	<artifactId>mybatis</artifactId>
	<version>3.5.2</version>
</dependency>
<!-- 分页插件 -->
<dependency>
    <groupId>com.github.pagehelper</groupId>
    <artifactId>pagehelper</artifactId>
    <version>5.1.10</version>
</dependency>
<!-- mysql驱动-->
<dependency>
	<groupId>mysql</groupId>
	<artifactId>mysql-connector-java</artifactId>
	<version>8.0.15</version>
</dependency>
<!-- logback -->
<dependency>
	<groupId>ch.qos.logback</groupId>
	<artifactId>logback-core</artifactId>
	<version>1.2.3</version>
	<type>jar</type>
</dependency>
<dependency>
	<groupId>ch.qos.logback</groupId>
	<artifactId>logback-classic</artifactId>
	<version>1.2.3</version>
	<type>jar</type>
</dependency>
```

## mybatis-config.xml的配置
注意：**configuration的标签必须按顺序写，不然会报错。**  
关于这个文件的配置，其实还有很多选项，只是常用的就下面这几个，其他的这里不做介绍。在网上找到一篇比较全面的博客，可以看看：[MyBatis详解3.MyBatis配置详解](https://www.jianshu.com/p/b3fc571e6da5)
  
```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration
PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
"http://mybatis.org/dtd/mybatis-3-config.dtd">
<!-- 注意：configuration的标签必须按顺序写，不然会报错 -->
<!-- properties?,settings?,typeAliases?,typeHandlers?,objectFactory?,objectWrapperFactory?
,reflectorFactory?,plugins?,environments?,databaseIdProvider?,mappers? -->
<configuration>

    <!-- 引入配置文件 -->
    <properties resource="jdbc.properties"></properties>
    
    <!-- 配置别名 -->
    <typeAliases>
        <package name="cn.zzs.mybatis.pojo"/>
    </typeAliases>    
    
    <!-- 配置插件 -->
    <plugins>
        <!-- 分页插件 -->
        <plugin interceptor="com.github.pagehelper.PageInterceptor"></plugin>
    </plugins>
    
    <!-- 配置环境：可以有多个 -->
    <environments default="development">
        <environment id="development">
            <!-- 使用jdbc事务管理 -->
            <transactionManager type="JDBC"/>
            <!-- 数据库连接池 -->
            <dataSource type="POOLED">
                <property name="driver" value="${jdbc.driver}" />
                <property name="url" value="${jdbc.url}" />
                <property name="username" value="${jdbc.username}" />
                <property name="password" value="${jdbc.password}" />
            </dataSource>
        </environment>
    </environments>
    
    <!-- 加载映射文件 -->
    <mappers>
        <package name="cn.zzs.mybatis.mapper"/>
    </mappers>
</configuration>
```

## *mapper.xml的配置
项目中的mapper.xml、Mapper接口和实体类都是逆向工程生成。生成的Mapper几乎包含了单表操作的所有方法，我们只要在这个基础上配置多表关系就行了。  

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
## SqlSession和Mapper的获取和使用
### SqlSession和Mapper的获取
注意，这个对象不是线程安全的，单独使用一般就是用于提交和回滚事务。 
 
```java
private UserMapper userMapper;

private SqlSessionFactory sqlSessionFactory;
private SqlSession sqlSession;
/**
 * 
 * 初始化
 */
@Before
public void init() {
	// 创建SqlSessionFactoryBuilder对象
	SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
	InputStream inputStream = null;
	try {
		// 查找配置文件创建输入流
		inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		// 加载配置文件，创建SqlSessionFactory对象
		sqlSessionFactory = sfb.build(inputStream);
		//获取SqlSession对象。注意，这个对象不是线程安全的。
		sqlSession = sqlSessionFactory.openSession(false);
		//初始化Mapper
		userMapper = sqlSession.getMapper(UserMapper.class);
	} catch (IOException e) {
		e.printStackTrace();
	}
}
```

### SqlSession和Mapper的使用
注意，逆向工程生成的mapper中只会包含基本的方法，如果我们要自定义方法，需要在Mapper接口中给出。另外，mapper.xml也必须配置好方法对应的sql。  

```java
/**
 * 测试添加
 */
@Test
public void testSave() {
	//开启事务:sqlSession获取时已经设置了手动提交
	try {
		//创建用户
		User user = new User(18, new Date(), new Date(), "zzs005");
		//设置角色
		user.setRoleId(1L);
		//保存
		userMapper.insert(user);
		//userMapper.insertSelective(new User(18, new Date(), new Date(), "zzs001"));
		//提交事务
		sqlSession.commit();
	} catch (Exception e) {
		logger.error("操作失败，事务回滚", e);
		sqlSession.rollback();
	}
}
```

## 分页插件的使用
注意，使用分页插件前提要在pom文件中引入pageHelper的依赖，并且在mybatis-config.xml中配置好plugins。  

```java
/**
 * 测试分页插件
 */
@Test
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
![mybatis原理图](https://github.com/ZhangZiSheng001/mybatis-demo/blob/master/img/mybatis原理图.jpg)

## 项目路径
测试单独使用Mybatis对数据库进行增删改查  
[mybatis-demo](https://github.com/ZhangZiSheng001/mybatis-projects/tree/master/mybatis-demo)  

测试Spring整合Mybatis对数据库进行增删改查  
[mybatis-spring-demo](https://github.com/ZhangZiSheng001/mybatis-projects/tree/master/mybatis-spring-demo)  

逆向工程   
[mybatis-generator](https://github.com/ZhangZiSheng001/mybatis-projects/tree/master/mybatis-generator)  

> 学习使我快乐！！
