package com.winter.websocket;

import java.io.Serializable;

/**
 * @Author: songyalong
 * @Description: 服务器向浏览器发送实体
 * @Date: Created in ${time}${date}
 * @Modified By:
 */
public class WiselyResponseMessage implements Serializable{
    private static final long serialVersionUID = -5245921503231068119L;
    private String responseMessage;

    public WiselyResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
