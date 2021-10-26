# 简介

mybatis 是一个持久层框架，它让我们可以方便、解耦地操作数据库。 相比 hibernate，mybatis 在国内更受欢迎，而且 mybatis 更面向数据库，可以灵活地对 sql 语句进行优化。

针对 Mybatis 的分析，我拆分成**使用、源码分析、生成器**等部分，已更新5篇博客，都放在 [Mybatis](https://www.cnblogs.com/ZhangZiSheng001/category/1685176.html) 这个系列里，内容将持续更新。

[Mybatis详解系列(一)--持久层框架解决了什么及如何使用Mybatis](https://www.cnblogs.com/ZhangZiSheng001/p/12603885.html)

 [Mybatis源码详解系列(二)--Mybatis如何加载配置及初始化](https://www.cnblogs.com/ZhangZiSheng001/p/12704076.html) 

 [Mybatis源码详解系列(三)--从Mapper接口开始看Mybatis的执行逻辑](https://www.cnblogs.com/ZhangZiSheng001/p/12761376.html) 

 [Mybatis源码详解系列(四)--你不知道的Mybatis用法和细节](https://www.cnblogs.com/ZhangZiSheng001/p/12773971.html) 

 [Mybatis详解系列(五)--Mybatis Generator和全注解风格的MyBatis3DynamicSql](https://www.cnblogs.com/ZhangZiSheng001/p/12820344.html) 



> 相关源码请移步：[mybatis-demo](https://github.com/ZhangZiSheng001/mybatis-projects)

> 本文为原创文章，转载请附上原文出处链接：[https://www.cnblogs.com/ZhangZiSheng001/p/13237670.html](https://www.cnblogs.com/ZhangZiSheng001/p/13237670.html)