package com.example.design_pattern.chainOfResPattern.demo;

/**
 * 总监
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/16 15:14
 */
public class Majordomo extends Manager {

    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {
        if ("请假".equals(request.getRequestType())) {
            if (request.getNumber() > 7) {
                System.out.println(name + "总监，批准了{" + request.getRequestContent() + "}");
            }
        } else {
            if (superior != null) {
                superior.requestApplication(request);
            }
        }
    }
}
