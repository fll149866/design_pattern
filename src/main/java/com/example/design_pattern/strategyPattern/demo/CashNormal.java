package com.example.design_pattern.strategyPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/19 16:27
 */
public class CashNormal extends CashSuper {

    /**
     * 普通收取方式，没有任何打折优惠
     *
     * @param money - 收取现金
     */
    @Override
    public void acceptCash(Double money) {
        System.out.println("收取现金：" + money);
    }
}
