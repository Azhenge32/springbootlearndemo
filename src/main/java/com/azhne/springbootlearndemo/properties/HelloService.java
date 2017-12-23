package com.azhne.springbootlearndemo.properties;

/**
 * @author Azhen
 * @date 2017/12/18
 */
public class HelloService {
    private String msg;

    public String sayHello() {
        return "Hello " + msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
