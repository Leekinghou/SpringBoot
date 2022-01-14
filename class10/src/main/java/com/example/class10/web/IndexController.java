package com.example.class10.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: lijinhao
 * @date: 2022/01/10 22:03
 */

@Controller
public class IndexController {
    @RequestMapping(value = "/say")
    public @ResponseBody String say(){
        return "Hello SpringBoot";
    }
}
