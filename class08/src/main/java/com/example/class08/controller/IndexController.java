package com.example.class08.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: lijinhao
 * @date: 2022/01/07 18:01
 */

@Controller
public class IndexController {

    @RequestMapping(value = "/say")
    @ResponseBody
    public String say(){
        return "say hello";
    }

    @RequestMapping(value = "/anothersay")
    public @ResponseBody Map<String, Object> mapvalue(){
        Map<String, Object> retMap = new HashMap<>();
        retMap.put("message", "sping boot project");

        return retMap;
    }

}
