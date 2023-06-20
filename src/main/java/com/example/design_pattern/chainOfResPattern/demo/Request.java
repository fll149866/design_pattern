package com.example.design_pattern.chainOfResPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/16 15:01
 */
public class Request {

    /**
     * 请求类型
     */
    private String requestType;

    /**
     * 请求内容
     */
    private String requestContent;

    /**
     * 请求数量
     */
    private int number;

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
