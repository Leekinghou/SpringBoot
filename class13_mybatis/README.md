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
    </dependencies>
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
