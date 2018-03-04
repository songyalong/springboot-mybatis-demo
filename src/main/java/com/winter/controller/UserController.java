package com.winter.controller;

import com.winter.model.User;
import com.winter.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping(value = "/user")
@Api("swaggerDemoController相关的api")
public class UserController {
    private static final Logger logger = Logger.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @Autowired
    private MessageSource messageSource;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Object insertUser(@Valid User user, BindingResult result){
        if(result.hasErrors()){
            List<FieldError> fieldErrors = result.getFieldErrors();
            StringBuffer msg = new StringBuffer();
            Locale locale = LocaleContextHolder.getLocale();
            for(FieldError fieldError : fieldErrors){
                String message = messageSource.getMessage(fieldError, locale);
                msg.append(fieldError.getField()+":"+message);
            }
            return messageSource;

        }
        return userService.addUser(user);
    }


    @ApiOperation(value="获取用户列表", notes="")
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=utf-8"}, method = RequestMethod.POST)
    public Object findUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        return userService.findAllUser(pageNum, pageSize);
    }

    @ApiOperation(value = "根据用户id获取用户信息")
    @RequestMapping(value = "/{user_id}", method = RequestMethod.GET)
    public User getUserByid(@PathVariable("user_id") Integer userId){
        logger.info("获取用户信息 userId = "+userId);
        User user = userService.findUserById(userId);
        return user;
    }


}
