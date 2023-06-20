package com.example.design_pattern.chainOfResPattern.demo;

/**
 * 经理
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/16 15:09
 */
public class CommonManager extends Manager {

    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {
        if ("请假".equals(request.getRequestType())) {
            if (request.getNumber() <= 7) {
                System.out.println(name + "经理，批准了{" + request.getRequestContent() + "}");
            } else {
                // 存在上级，则上级处理请求
                if (superior != null) {
                    superior.requestApplication(request);
                }
            }
        } else {
            if (superior != null) {
                superior.requestApplication(request);
            }
        }
    }
}
