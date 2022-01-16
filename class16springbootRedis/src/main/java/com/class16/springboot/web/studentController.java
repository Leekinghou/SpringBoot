package com.class16.springboot.web;

import com.class16.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: lijinhao
 * @date: 2022/01/16 11:06
 */

@Controller
public class studentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/put")
    public @ResponseBody Object put(String key, String value){
        studentService.put(key, value);
        return "success";
    }

    @RequestMapping(value = "/get")
    public @ResponseBody Object get(){
        return "key: " + studentService.get("name");
    }
}
