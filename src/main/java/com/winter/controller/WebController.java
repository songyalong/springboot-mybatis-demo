package com.winter.controller;

import com.winter.websocket.WiselyMessage;
import com.winter.websocket.WiselyResponseMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * @Author: songyalong
 * @Description: WebSocker 测试Controller
 * @Date: Created in ${time}${date}
 * @Modified By:
 */
@Controller
public class WebController {

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public WiselyResponseMessage say(WiselyMessage wiselyMessage) throws InterruptedException {

        Thread.sleep(3000);
        return new WiselyResponseMessage("欢迎使用web socket" + wiselyMessage.getName());
    }
}
