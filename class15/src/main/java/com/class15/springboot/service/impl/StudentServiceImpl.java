package com.class15.springboot.service.impl;

import com.class15.springboot.mapper.StudentMapper;
import com.class15.springboot.model.Student;
import com.class15.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: lijinhao
 * @date: 2022/01/15 14:42
 */

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int updateStudentById(Student student) {
        return studentMapper.updateByPrimaryKeySelective(student);
    }
}
