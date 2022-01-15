package com.example.class14_mybatis.springboot.service;


import com.example.class14_mybatis.springboot.model.Student;

/**
 * @author: lijinhao
 * @date: 2022/01/15 00:08
 */

public interface StudentService {
    /**cc
     *
     * @param id
     * @return
     */
    Student queryStudentById(Integer id);
}
