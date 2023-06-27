package com.example.design_pattern.factoryPattern.demo03;

import com.example.design_pattern.factoryPattern.demo02.AliPay;
import com.example.design_pattern.factoryPattern.demo02.Pay;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/27 16:00
 */
public class AliPayFactory implements PayFactory {

    @Override
    public Pay getPay() {
        return new AliPay();
    }
}
