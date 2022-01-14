package com.example.class11.web;

import com.example.class11.config.school;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: lijinhao
 * @date: 2022/01/10 22:29
 */

@Controller
public class IndexController {
    @Value("${author}")
    private String author;

    @Value("${contact}")
    private String contact;

    @RequestMapping(value = "contact")
    public @ResponseBody String contact(){
        return "author: " + author + ", email: "+ contact;
    }
    @RequestMapping(value = "/say")
    public @ResponseBody String say(){
        return "say Hello!";
    }

    @Autowired
    private com.example.class11.config.school school;

    @RequestMapping(value = "/info")
    public @ResponseBody String info(){
        return "name: "+ school.getName() + "address: " + school.getAddress() + "date: " + school.getDate();
    }
}
