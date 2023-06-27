package com.example.design_pattern.factoryPattern.demo04;

import com.example.design_pattern.factoryPattern.demo02.Pay;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/27 16:24
 */
public interface OrderFactory {

    /**
     * 获取支付
     *
     * @return
     */
    Pay getPay();

    /**
     * 申请退款
     *
     * @return
     */
    Refund getRefund();
}
