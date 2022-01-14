package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lijinhao
 * @date: 2021/12/31 10:32
 */

@Controller
@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return  "this is home page!";
    }

    @RequestMapping(value = "/say")
    public @ResponseBody Object index(){
        return "Hello SpringBoot!";
    }
}

//@Controller
//public class SpringBootController{
//    @RequestMapping(value = "/say")
//    public @ResponseBody Object index(){
//        return "Hello SpringBoot!";
//    }
//}
