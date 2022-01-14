## 工程简介

springboot集成mybatis
1. mybatis依赖、mysql驱动
2. 使用mybatis提供的逆向工程生成实体bean、映射文件、dao接口

## 步骤  
1. 需要在pom.xml中添加驱动和依赖
```xml
<!--MySQL驱动-->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
</dependency>

<!--MyBatis提供的整合Springboot框架的起步依赖-->
<dependency>
    <groupId>org.mybatis.spring.boot</groupId>
    <artifactId>mybatis-spring-boot-starter</artifactId>
    <version>2.2.0</version>
</dependency>
```

2. 需要在pom.xml中添加编译插件
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

3. 需要理解GeneratorMapper.xml中的配置信息

4. 生成的数据库映射表配置文件
resultMap的作用:
- 当数据库中的字段名称与实体类对象的属性名字不一样时，可以用于转换
- 当查询结果没有对应一个表时，可以自定义一个结果集
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

## 提供服务  

web层提供服务需要实现一个路由，提供服务的接口对象来自于业务层
![](https://gitee.com/leekinghou/image/raw/master/img/20220114201137.png)

业务层有一个StudentService接口的实现类，实现了`queryStudentById(id)`方法  
1. 有SpringBoot的@Service注解  

![](https://gitee.com/leekinghou/image/raw/master/img/20220114201427.png)

再下一层的DAO接口与数据库交互，通过学生id查询详情信息
- 需要添加@Mapper注入  
![](https://gitee.com/leekinghou/image/raw/master/img/20220114201728.png)

1. 在pom.xml中添加绑定信息

idea规定：java文件就在java目录里面，resource文件就在resource里面  
但是，mybatis自动生成的xxxMapper.xml文件生成在java目录，因此需要手动指定，否则报错  
![](https://gitee.com/leekinghou/image/raw/master/img/20220114224911.png)

```xml
<!--手动指定文件夹为resources-->
<resources>
    <resource>
        <directory>src/main/java</directory>
        <includes>
            <include>**/*.xml</include>
        </includes>
    </resource>
</resources>
```

2. 在application.properties中配置数据库连接文件

```
# 设置连接数据库的配置
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/springboot?useUnicode=true&characterEncoding=UTF-8&
useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=GMT%2B8
spring.datasource.username=root
spring.datasource.password=123456
```
