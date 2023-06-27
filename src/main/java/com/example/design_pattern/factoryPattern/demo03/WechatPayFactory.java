package com.example.design_pattern.factoryPattern.demo03;

import com.example.design_pattern.factoryPattern.demo02.Pay;
import com.example.design_pattern.factoryPattern.demo02.WeChatPay;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/27 15:59
 */
public class WechatPayFactory implements PayFactory {

    @Override
    public Pay getPay() {
        return new WeChatPay();
    }
}
