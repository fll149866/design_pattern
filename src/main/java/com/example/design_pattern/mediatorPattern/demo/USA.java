package com.example.design_pattern.mediatorPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/16 16:17
 */
public class USA extends Country {


    public USA(UnitedNations mediator) {
        super(mediator);
    }

    /**
     * 声明
     *
     * @param message
     */
    public void declare(String message) {
        mediator.declare(message, this);
    }

    /**
     * 获取信息
     */
    public void getMessage(String message) {
        System.out.println("美国获取对方消息为：" + message);
    }
}
