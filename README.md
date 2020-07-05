# 简介

Mybatis 是一个持久层框架，它对 JDBC 进行了高级封装，使我们的代码中不会出现任何的 JDBC 代码，另外，它还通过 xml 或注解的方式将 sql 从 DAO/Repository 层中解耦出来，除了这些基本功能外，它还提供了动态 sql、延迟加载、缓存等功能。 相比 Hibernate，Mybatis 更面向数据库，可以灵活地对 sql 语句进行优化。

针对 Mybatis 的分析，我拆分成**使用、源码分析、生成器**等部分，已更新5篇博客，都放在 [Mybatis](https://www.cnblogs.com/ZhangZiSheng001/category/1685176.html) 这个系列里，内容将持续更新。

[Mybatis详解系列(一)--持久层框架解决了什么及如何使用Mybatis](https://www.cnblogs.com/ZhangZiSheng001/p/12603885.html)

 [Mybatis源码详解系列(二)--Mybatis如何加载配置及初始化](https://www.cnblogs.com/ZhangZiSheng001/p/12704076.html) 

 [Mybatis源码详解系列(三)--从Mapper接口开始看Mybatis的执行逻辑](https://www.cnblogs.com/ZhangZiSheng001/p/12761376.html) 

 [Mybatis源码详解系列(四)--你不知道的Mybatis用法和细节](https://www.cnblogs.com/ZhangZiSheng001/p/12773971.html) 

 [Mybatis详解系列(五)--Mybatis Generator和全注解风格的MyBatis3DynamicSql](https://www.cnblogs.com/ZhangZiSheng001/p/12820344.html) 



> 相关源码请移步：[mybatis-demo](https://github.com/ZhangZiSheng001/mybatis-projects)

> 本文为原创文章，转载请附上原文出处链接：[https://www.cnblogs.com/ZhangZiSheng001/p/13237670.html](https://www.cnblogs.com/ZhangZiSheng001/p/13237670.html)
