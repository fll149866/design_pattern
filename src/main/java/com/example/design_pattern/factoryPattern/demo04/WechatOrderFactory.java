package com.example.design_pattern.factoryPattern.demo04;

import com.example.design_pattern.factoryPattern.demo02.Pay;
import com.example.design_pattern.factoryPattern.demo02.WeChatPay;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/27 16:37
 */
public class WechatOrderFactory implements OrderFactory {
    @Override
    public Pay getPay() {
        return new WeChatPay();
    }

    @Override
    public Refund getRefund() {
        return new WechatRefund();
    }
}
