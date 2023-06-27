package com.example.design_pattern.factoryPattern.demo04;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/27 16:38
 */
public class WechatRefund implements Refund {

    @Override
    public void refund() {
        System.out.println("微信 退款中...");
    }
}
