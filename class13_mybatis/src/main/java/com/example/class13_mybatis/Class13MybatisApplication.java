package com.example.class13_mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.class13_mybatis.springboot.mapper") //开启扫描Mapper接口的包以及子目录
public class Class13MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Class13MybatisApplication.class, args);
    }

}
