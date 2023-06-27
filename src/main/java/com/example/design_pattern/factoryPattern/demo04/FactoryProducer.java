package com.example.design_pattern.factoryPattern.demo04;

/**
 * 超级工厂
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/27 16:35
 */
public class FactoryProducer {

    public static OrderFactory createOrderFactory(String orderType) {
        if ("wechat".equals(orderType)) {
            return new WechatOrderFactory();
        } else if ("ali".equals(orderType)) {
            return new AliOrderFactory();
        }

        return null;
    }
}
