package com.example.class13_mybatis.springboot.service;

import com.example.class13_mybatis.springboot.model.Student;

/**
 * @author: lijinhao
 * @date: 2022/01/14 16:55
 */

public interface StudentService {

    /**cc
     * 根据学生ID查询详情
     * @param id
     * @return
     */


    Student queryStudentById(Integer id);
}
