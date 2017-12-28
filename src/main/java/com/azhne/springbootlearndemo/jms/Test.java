package com.azhne.springbootlearndemo.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

/**
 * @author Azhen
 * @date 2017/12/28
 */
public class Test {
    @Autowired
    JmsTemplate jmsTemplate;

    public void send() {
        jmsTemplate.send("my-destination", new Msg());
    }
}
