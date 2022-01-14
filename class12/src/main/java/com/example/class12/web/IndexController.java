package com.example.class12.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: lijinhao
 * @date: 2022/01/12 00:33
 */

@Controller
public class IndexController {

    @RequestMapping(value = "/say")
    public ModelAndView say(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello, SpringBoot");
        mv.setViewName("say");
        return mv;
    }

}



