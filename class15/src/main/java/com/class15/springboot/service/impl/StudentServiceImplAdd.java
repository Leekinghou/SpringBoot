package com.class15.springboot.service.impl;

import com.class15.springboot.mapper.StudentMapper;
import com.class15.springboot.model.Student;
import com.class15.springboot.service.StudentService;
import com.class15.springboot.service.StudentServiceAdd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: lijinhao
 * @date: 2022/01/15 18:33
 */

@Service
public class StudentServiceImplAdd implements StudentServiceAdd {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int addStudent(Student record) {
        return studentMapper.insert(record);
    }
}
