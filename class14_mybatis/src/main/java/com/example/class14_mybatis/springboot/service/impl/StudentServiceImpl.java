package com.example.class14_mybatis.springboot.service.impl;


import com.example.class14_mybatis.springboot.mapper.StudentMapper;
import com.example.class14_mybatis.springboot.model.Student;
import com.example.class14_mybatis.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: lijinhao
 * @date: 2022/01/15 00:10
 */

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}

