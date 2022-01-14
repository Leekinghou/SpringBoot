# 工程简介
- [class08](#class08) 注解的两种写法
- [class09](#class09) 使用springboot框架的核心配置文件
- <a href="#class10">class10 </a>多环境下配置文件切换
- [class11](#class11) 获取application.properties中的自定义配置
- [class12](#class12) springboot使用jsp
- [class13](#class13) springboot-mybatis逆向工程
# class08
##  工程简介
使用springboot框架的核心配置文件application.properties

## 注解的两种写法

```java
@Controller
public class IndexController {
    @RequestMapping(value = "/say")
    @ResponseBody
    public String say() {
        return "say hello";
    }

    @RequestMapping(value = "/anothersay")
    public @ResponseBody
    Map<String, Object> mapvalue() {
        Map<String, Object> retMap = new HashMap<>();
        retMap.put("message", "sping boot project");

        return retMap;
    }

    @RequestMapping(value = "/sayagain")
    public @ResponseBody say(String message){
        return "hello" + message;
    }
}
```

# class09

## 工程简介
使用springboot框架的核心配置文件application.yml或者application.yaml

# class10

## 工程简介

多环境下：
1. 本地开发环境
2. 测试环境
3. 准生产/生产环境
配置文件自由切换


## 方法步骤
1. 新建不同环境下的配置文件，注意要以固定格式`application-`开头
   ![](https://gitee.com/leekinghou/image/raw/master/img/20220110221139.png)
2. 修改配置文件内的参数
    - dev：
    ```
    server.port=8080
    server.servlet.context-path=/dev
    ```

    - product：
    ```
   server.port=80
   server.servlet.context-path=/product
    ```
3. 在主配置文件`application.properties`指定使用哪个版本的配置文件
    ```
    # 激活使用配置文件
    spring.profiles.active=dev
    ```

# class11
## 工程简介

获取`application.properties`中的自定义配置


# class12  
## 工程简介

springboot集成jsp

现在主要是前后端分离，使用jsp很少

1. 新增webapp文件夹(普通文件)后，在project structure下新增source:
   ![](https://gitee.com/leekinghou/image/raw/master/img/20220111174651.png)

# class13  
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


