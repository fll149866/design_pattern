package com.example.design_pattern.strategyPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/19 16:36
 */
public class DemoMain {

    public static void main(String[] args) {
        CashStrategy cashStrategy = new CashStrategy("打折优惠");
        cashStrategy.getRes(100d);
    }
}
