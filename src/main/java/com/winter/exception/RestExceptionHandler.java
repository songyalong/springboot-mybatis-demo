package com.winter.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @Author: songyalong
 * @Description: 全局异常处理
 * @Date: Created in ${time}${date}
 * @Modified By:
 */
@ControllerAdvice
@ResponseBody
public class RestExceptionHandler {

    @ExceptionHandler
    @ResponseStatus
    public  ApiResult runTimeExceptionHandler(Exception e){
    }
}
