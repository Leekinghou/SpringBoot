package com.class15.springboot.web;

import com.class15.springboot.service.StudentService;
import com.class15.springboot.model.Student;
import com.class15.springboot.service.StudentServiceAdd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: lijinhao
 * @date: 2022/01/15 14:35
 */

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentServiceAdd studentServiceAdd;

    @RequestMapping(value = "/update")
    public @ResponseBody Object update(Integer id, String name){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        int updateCount = studentService.updateStudentById(student);

        return "修改学生编号为" + id + "的姓名的结果：" + updateCount;
    }

    @PostMapping(value = "/student/{id}/{name}/{age}")
    public Object addStudent(@PathVariable("id") Integer id,
                             @PathVariable("name") String name,
                             @PathVariable("age") Integer age){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        int addCount = studentServiceAdd.addStudent(student);

        Map<String, Object> retMap = new HashMap<>();
        retMap.put("id", id);
        retMap.put("name", name);
        retMap.put("age", age);
        retMap.put("success", addCount);

        return retMap;
    }
}
