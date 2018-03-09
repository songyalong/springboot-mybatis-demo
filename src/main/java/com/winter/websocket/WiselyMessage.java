package com.winter.websocket;

import java.io.Serializable;

/**
 * @Author: songyalong
 * @Description: 浏览器向服务器发送请求实体
 * @Date: Created in ${time}${date}
 * @Modified By:
 */
public class WiselyMessage implements Serializable{

    private static final long serialVersionUID = -7626818182240718181L;
    private String name;

    public WiselyMessage(){}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
