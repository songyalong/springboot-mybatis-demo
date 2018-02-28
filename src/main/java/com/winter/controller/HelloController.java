package com.winter.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {
    private static final Logger logger = Logger.getLogger(HelloController.class);
    @RequestMapping(value = "/index/")
    public ModelAndView index(){
        logger.info("hello ttt");
        ModelAndView mv = new ModelAndView();
        mv.addObject("url",  null);
        mv.setViewName("index");
        return mv;
    }
}
