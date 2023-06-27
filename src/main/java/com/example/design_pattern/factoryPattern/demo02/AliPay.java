package com.example.design_pattern.factoryPattern.demo02;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/27 15:27
 */
public class AliPay implements Pay {

    @Override
    public void unifiedOrder() {
        System.out.println("支付宝 统一下单接口");
    }
}
