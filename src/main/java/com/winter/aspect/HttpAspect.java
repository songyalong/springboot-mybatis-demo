package com.winter.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class HttpAspect {
    @Pointcut("execution(public * com.winter.controller.UserController.getUserByid(..))")
    public void log(){
    }

    @Before("log()")
    public void doBefore(){
        System.out.println(2222222);
    }

    @AfterReturning(returning = "object", pointcut = "log()")
    public void afterReturing(Object object){
        System.out.println(object);
    }
}
