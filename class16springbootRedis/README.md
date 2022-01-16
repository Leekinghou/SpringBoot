## 工程简介
1. 添加操作redis数据类型的依赖
2. 在springboot核心配置文件中添加redis的配置


## 添加依赖
```xml
<!--springboot集成redis的起步依赖-->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-redis</artifactId>
</dependency>
```

## 添加application.properties
```java
# 设置redis配置信息
spring.redis.host=localhost
spring.redis.port=6379
spring.redis.password=
```

## 业务层代码
- `private RedisTemplate<Object, Object> redisTemplate;`
- `opsForValue()`操作string类型
```java
@Service
public class StudentServiceImpl implements StudentService {
    /**
     * 操作redis的模版对象，由redis提供
     */
    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Override
    public void put(String key, String value) {
        // opsForValue()操作string类型
        redisTemplate.opsForValue().set(key, value);
    }
}
```






