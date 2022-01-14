## 工程简介

springboot集成mybatis
1. mybatis依赖、mysql驱动
2. 使用mybatis提供的逆向工程生成实体bean、映射文件、dao接口

## 需要在pom.xml中添加驱动和依赖
```xml
<!--MySQL驱动-->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
</dependency>

<!--MyBatis整合Springboot框架的起步依赖-->
<dependency>
    <groupId>org.mybatis.spring.boot</groupId>
    <artifactId>mybatis-spring-boot-starter</artifactId>
    <version>2.2.0</version>
</dependency>
```

## 需要在pom.xml中添加编译插件
```xml
<!--mybatis 代码自动生成插件-->
<plugin>
    <groupId>org.mybatis.generator</groupId>
    <artifactId>mybatis-generator-maven-plugin</artifactId>
    <version>1.3.6</version>
    <configuration>
        <!--配置文件的位置--> <configurationFile>GeneratorMapper.xml</configurationFile> <verbose>true</verbose>
        <overwrite>true</overwrite>
    </configuration>
</plugin>
```

## 需要理解GeneratorMapper.xml中的配置信息


## 生成的数据库映射表配置文件
resultMap的作用
1. 当数据库中的字段名称与实体类对象的属性名字不一样时，可以用于转换
2. 当查询结果没有对应一个表时，可以自定义一个结果集
```xml
<resultMap id="BaseResultMap" type="com.example.class13_mybatis.springboot.model.Student">
    <!--
        id 标签只能修改主键字段
        result 除了主键以外的字段
        column 数据库中的字段名
        property 映射对象的属性名称 
        jdbcType 列中数据库中字段的类型（可省略）
        -->
    <id column="id" jdbcType="INTEGER" property="id" />
    <result column="name" jdbcType="VARCHAR" property="name" />
    <result column="age" jdbcType="INTEGER" property="age" />
</resultMap>
```
