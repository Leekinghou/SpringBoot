package com.example.class09.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: lijinhao
 * @date: 2022/01/10 21:23
 */

@Controller
public class IndexController {
    @RequestMapping(value = "/say")
    public @ResponseBody Object say(String message){
        return "Say: Hello " + message;
    }

}
