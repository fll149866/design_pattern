package com.example.design_pattern.factoryPattern.demo04;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/27 16:28
 */
public class AliRefund implements Refund {

    @Override
    public void refund() {
        System.out.println("支付宝 退款...");
    }
}
