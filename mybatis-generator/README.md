# mybatis-generator

## 简介
`Mybatis Generator`是`maven`插件，通过配置`generatorConfig.xml`的方式，可以为生成`POJO`、`Mapper`和`mapper.xml`，当然，生成的`mapper`中只包含了单表操作的方法。  

## 需求
是使用`Mybatis Generator`为以下三个实体生成`POJO`、`Mapper`和`mapper.xml`：  

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
注意，这里只要配置插件就行，数据库驱动和mybatis的依赖都写在插件内部。    

```xml
<plugins>
	<plugin>
		<groupId>org.apache.maven.plugins</groupId>
		<artifactId>maven-compiler-plugin</artifactId>
		<version>3.2</version>
		<configuration>
			<source>1.8</source>
			<target>1.8</target>
			<encoding>UTF-8</encoding>
			<showWarnings>true</showWarnings>
		</configuration>
	</plugin>
	<plugin>
		<groupId>org.mybatis.generator</groupId>
		<artifactId>mybatis-generator-maven-plugin</artifactId>
		<version>1.3.7</version>
		<executions>
			<execution>
				<id>Generate MyBatis Artifacts</id>
				<phase>package</phase>
				<goals>
					<goal>generate</goal>
				</goals>
			</execution>
		</executions>
		<configuration>
			<!--允许移动生成的文件 -->
			<verbose>true</verbose>
			<!-- 是否覆盖 -->
			<overwrite>true</overwrite>
			<!-- 自动生成的配置 -->
			<configurationFile>
				src/main/resources/generatorConfig.xml
			</configurationFile>
		</configuration>
		<dependencies>
			<dependency>
				<groupId>mysql</groupId>
				<artifactId>mysql-connector-java</artifactId>
				<version>8.0.15</version>
			</dependency>
			<dependency>
				<groupId>org.mybatis.generator</groupId>
				<artifactId>mybatis-generator-core</artifactId>
				<version>1.3.7</version>
			</dependency>
			<dependency>
				<groupId>org.mybatis</groupId>
				<artifactId>mybatis</artifactId>
				<version>3.5.2</version>
			</dependency>
		</dependencies>
	</plugin>
</plugins>
```

## 编写generatorConfig.xml
注意：如果要求数据库字段和实体类名称不一致，可以使用正则表达式来命名。见以下`columnRenamingRule`标签。  

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE generatorConfiguration
        PUBLIC "-//mybatis.org//DTD MyBatis Generator Configuration 1.0//EN"
        "http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd">
<generatorConfiguration>
    <!-- 官方文档：http://www.mybatis.org/generator/configreference/commentGenerator.html -->
	<!--导入属性配置 -->
	<properties resource="jdbc.properties"></properties>

	<!-- context 是逆向工程的主要配置信息 -->
	<!-- id：起个名字 -->
	<!-- targetRuntime：设置生成的文件适用于那个 mybatis 版本 -->
	<context id="default" targetRuntime="MyBatis3">

		<!--optional,旨在创建class时，对注释进行控制 -->
		<commentGenerator>
			<property name="suppressDate" value="true" />
			<!-- 是否去除自动生成的注释 true：是 ： false:否 -->
			<property name="suppressAllComments" value="true" />
		</commentGenerator>

		<!--jdbc的数据库连接 -->
		<jdbcConnection 
			driverClass="${jdbc.driver}"
			connectionURL="${jdbc.url}" 
			userId="${jdbc.username}"
			password="${jdbc.password}">
		</jdbcConnection>

		<!--非必须，类型处理器，在数据库类型和java类型之间的转换控制 -->
		<javaTypeResolver>
			<!-- 默认false，把JDBC DECIMAL 和 NUMERIC 类型解析为 Integer -->
			<!-- 为 true时把JDBC DECIMAL 和 NUMERIC 类型解析为java.math.BigDecimal -->
			<property name="forceBigDecimals" value="false" />
		</javaTypeResolver>

		<!-- targetPackage：生成的实体类所在的包 -->
		<!-- targetProject：生成的实体类所在的硬盘位置 -->
		<javaModelGenerator 
			targetPackage="cn.zzs.mybatis.pojo"
			targetProject=".\src\main\java">
			<!-- 是否允许子包 -->
			<property name="enableSubPackages" value="false" />
			<!-- 是否对modal添加构造函数 -->
			<property name="constructorBased" value="true" />
			<!-- 是否清理从数据库中查询出的字符串左右两边的空白字符 -->
			<property name="trimStrings" value="true" />
			<!-- 建立modal对象是否不可改变 即生成的modal对象不会有setter方法，只有构造方法 -->
			<property name="immutable" value="false" />
		</javaModelGenerator>

		<!-- targetPackage 和 targetProject：生成的 mapper.xml 文件的包和位置 -->
		<sqlMapGenerator 
			targetPackage="cn.zzs.mybatis.mapper"
			targetProject=".\src\main\resources">
			<!-- 针对数据库的一个配置，是否把 schema 作为子包名 -->
			<property name="enableSubPackages" value="false" />
		</sqlMapGenerator>

		<!-- targetPackage 和 targetProject：生成的 interface 文件的包和位置 -->
		<javaClientGenerator type="XMLMAPPER" 
			targetPackage="cn.zzs.mybatis.mapper" 
			targetProject=".\src\main\java">
			<!-- 针对 oracle 数据库的一个配置，是否把 schema 作为子包名 -->
			<property name="enableSubPackages" value="false" />
		</javaClientGenerator>
		
		<!-- 指定数据库表 -->
		<table tableName="mybatis_menu" domainObjectName="Menu" >
		   <columnRenamingRule searchString="^(menu_)|(gmt_)" replaceString=""/>
		</table>
		<table tableName="mybatis_role" domainObjectName="Role">
		  <columnRenamingRule searchString="^(role_)|(gmt_)" replaceString=""/>
		</table>
		<table tableName="mybatis_user" domainObjectName="User">
		  <columnRenamingRule searchString="^(user_)|(gmt_)" replaceString=""/>
		</table>
	</context>
</generatorConfiguration>

```

## 插件命令执行
maven build，输入mybatis-generator:generate，生成成功。  

## 出现的异常
如果自动生成代码时出现以下提示：  

```
Cannot obtain primary key information from the database
```

在jdbc url后增加 ?nullCatalogMeansCurrent=true即可(但此时不会生成withBLOBs类)，这个异常处理参考以下：  
[Mybatis-mybatis自动生成代码提示"Cannot obtain primary key information from ..."解决方案](https://blog.csdn.net/jpf254/article/details/79571396)


> 学习使我快乐！！



