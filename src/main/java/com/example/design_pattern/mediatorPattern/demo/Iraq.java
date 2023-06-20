package com.example.design_pattern.mediatorPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/16 16:21
 */
public class Iraq extends Country {

    public Iraq(UnitedNations mediator) {
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
     *
     * @param message
     */
    public void getMessage(String message) {
        System.out.println("伊拉克得到对方的信息为：" + message);
    }
}
