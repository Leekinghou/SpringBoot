package com.example.class13_mybatis.springboot.mapper;

import com.example.class13_mybatis.springboot.model.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper //Dao扫描接口提供给Spring容器
public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}
