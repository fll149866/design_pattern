package com.example.design_pattern.factoryPattern.demo04;

import com.example.design_pattern.factoryPattern.demo02.AliPay;
import com.example.design_pattern.factoryPattern.demo02.Pay;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/27 16:26
 */
public class AliOrderFactory implements OrderFactory {

    @Override
    public Pay getPay() {
        return new AliPay();
    }

    @Override
    public Refund getRefund() {
        return new AliRefund();
    }
}
