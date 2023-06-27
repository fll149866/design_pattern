package com.example.design_pattern.factoryPattern.demo03;

import com.example.design_pattern.factoryPattern.demo02.Pay;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/27 15:59
 */
public interface PayFactory {

    /**
     * 获取支付方式
     *
     * @return
     */
    Pay getPay();
}
