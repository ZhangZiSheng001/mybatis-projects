# mybatis-projects

## 简介
`Mybatis`是一个持久层框架，相比`Hibernate`（面向Code），更面向DB，可以灵活地对`sql`语句进行优化。它封装了`JDBC`访问数据库的过程，整合连接池，并提供了事务机制。  

`Mybatis`利用动态代理自动实现`Mapper`接口，而且这种方式可以利用逆向工程生成代码，非常方便。我们开发时只需专注如何拼装`sql`语句，其它复杂的过程全部可以交给`Mybatis`去完成。 

通过源码分析，`Mybatis`的`sqlSession`在执行数据库操作时，会利用`Configuration`配置对象获得`MappedStatement`对象（方法和执行语句的Map），根据这个对象`Executor`执行器对象完成传入参数的处理、语句的执行和结果集的封装。  

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
