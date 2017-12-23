package com.azhne.springbootlearndemo.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.security.Principal;

/**
 * @author Azhen
 * @date 2017/12/22
 */
@Controller
public class WsController {
    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public WiselyResponse say(WiselyMessage message) throws Exception {
        Thread.sleep(3000);
        return new WiselyResponse("Welcome, " + message.getName() + "!");
    }

    @MessageMapping("/chat")
    public void handleChat(Principal principal, String msg) {
        if (principal.getName().equals("wyf")) {
            simpMessagingTemplate.convertAndSendToUser("wisely", "/queue/notifications", principal.getName() + "给您发来了消息： " + msg);
        } else {
           simpMessagingTemplate.convertAndSendToUser("wyf", "/queue/notifications", principal.getName() + "给您发来了消息： " + msg);
        }
    }
}
