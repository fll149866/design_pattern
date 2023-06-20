package com.example.design_pattern.chainOfResPattern.demo;

/**
 * 总经理
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/16 15:16
 */
public class GeneralManager extends Manager {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {
        if ("加薪".equals(request.getRequestType())) {
            if (request.getNumber() < 1000) {
                System.out.println(name + "总经理，不予批准加薪太少了！");
            } else {
                System.out.println(name + "总经理，批准！");
            }
        } else {
            System.out.println("先等下吧！");
        }
    }
}
