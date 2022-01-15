package com.example.class14_mybatis.springboot.web;

import com.example.class14_mybatis.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: lijinhao
 * @date: 2022/01/15 00:05
 */

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student")
    public @ResponseBody Object check(Integer id){
        return studentService.queryStudentById(id);
    }
}
