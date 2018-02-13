package com.winter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {
    @RequestMapping(value = "/index/")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("url", "ttttttttttttttt");
        mv.setViewName("index");
        return mv;
    }
}
