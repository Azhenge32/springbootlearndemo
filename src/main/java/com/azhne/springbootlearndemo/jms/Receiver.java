package com.azhne.springbootlearndemo.jms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author Azhen
 * @date 2017/12/28
 */
@Component
public class Receiver {

    @JmsListener(destination = "my-destination")
    public void receiveMessage(String message) {
        System.out.println("接受的： <" + message + ">"); }
}
