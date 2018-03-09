package com.winter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: songyalong
 * @Description:
 * @Date: Created in ${time}${date}
 * @Modified By:
 */
@RestController
public class IndexController {

    /**
     * @Author: songyalong
     * @Description: 登陆
     * @param
     * @Date: Created in 9:42 2018/3/1
     */
    @RequestMapping(value = "/login_view/", method = RequestMethod.GET)
    public String loginView(){
        ModelAndView mv = new ModelAndView("login");
        return "/login";
    }

    /**
     * @Author: songyalong
     * @Description: 首页
     * @param
     * @Date: Created in 9:43 2018/3/1
     */
    @RequestMapping(value = "/index/", method = RequestMethod.GET)
    public ModelAndView index(){
//        ModelAndView mv = new ModelAndView("index");
        ModelAndView mv = new ModelAndView("websocket");
        return mv;
    }
}
