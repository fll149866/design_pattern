package com.example.design_pattern.strategyPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/19 16:29
 */
public class CashRebate extends CashSuper {

    /**
     * 折扣
     */
    private Double rebate;

    public CashRebate(Double rebate) {
        this.rebate = rebate;
    }

    /**
     * 打折优惠
     *
     * @param money - 收取现金
     */
    @Override
    public void acceptCash(Double money) {
        System.out.println("收取现金：" + money * rebate);
    }
}
