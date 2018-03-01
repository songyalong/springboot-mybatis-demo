package com.winter.controller;

import com.winter.model.User;
import com.winter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/user/")
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * @Author: songyalong
     * @Description:
     * @param user 实体类对象
     * @param request
     * @Date: Created in 9:38 2018/3/1
     */
    @RequestMapping(value = "/login/")
    public ModelAndView login(User user, HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        String viewName = null;
        boolean flag = true;
        String result = "登陆成功";
        if(null != user.getUserName()){
            User userEntity = userService.findUser(user.getUserName(), user.getPassword());
            if(null == userEntity){
                flag = false;
                result = "用户不存在, 请重新登录";
                viewName = "login";
            }else{
                viewName = "index";
            }
            if (flag){
                request.getSession().setAttribute("_session_user", userEntity);
            }
        }else{
            viewName = "login";
        }

        mv.setViewName(viewName);
        mv.addObject("flag", flag);
        mv.addObject("result", result);
        return mv;
    }
}
