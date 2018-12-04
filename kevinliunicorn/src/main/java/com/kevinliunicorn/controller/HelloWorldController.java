package com.kevinliunicorn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/hello")
public class HelloWorldController {
    
    /**
     * 返回一个ModelAndView
     * @return
     */
    @RequestMapping(value="/world")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        //模型对象
        modelAndView.addObject("helloStr", "Hello World,Hello Spring MVC");
        //视图名称
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
