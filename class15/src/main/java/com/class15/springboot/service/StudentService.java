package com.class15.springboot.service;

import com.class15.springboot.model.Student;

import java.sql.Struct;

/**
 * @author: lijinhao
 * @date: 2022/01/15 14:39
 */

public interface StudentService {
    int updateStudentById(Student student);
}
