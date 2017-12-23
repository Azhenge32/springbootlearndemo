package com.azhne.springbootlearndemo.websocket;

/**
 * @author Azhen
 * @date 2017/12/22
 */
public class WiselyResponse {
    private String responseMessage;

    public WiselyResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }
    public String getResponseMessage() {
        return responseMessage;
    }
}
