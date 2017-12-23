package com.azhne.springbootlearndemo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Azhen
 * @date 2017/12/18
 */
@ConfigurationProperties(prefix = "Hello")
public class HelloServiceProperties {
    private static final String MSG = "world";
    private String msg = MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
