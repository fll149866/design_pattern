package com.example.design_pattern.factoryPattern.demo02;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/27 15:28
 */
public class PayFactory {

    /**
     * 创建支付方式
     *
     * @param payType
     * @return
     */
    public static Pay createPay(String payType) {
        if ("wechat".equals(payType)) {
            return new WeChatPay();
        } else if ("ali".equals(payType)) {
            return new AliPay();
            // ...
        } else {
            return null;
        }
    }
}
