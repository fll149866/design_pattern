package com.example.design_pattern.strategyPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/19 16:32
 */
public class CashReturn extends CashSuper {


    /**
     * 满足条件
     */
    private Double moneyCondition;

    /**
     * 返回金额
     */
    private Double moneyReturn;

    public CashReturn(Double moneyCondition,Double moneyReturn){
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    /**
     * 满减优惠
     *
     * @param money - 收取现金
     */
    @Override
    public void acceptCash(Double money) {
        double acceptCash = money-Math.floor(money/moneyCondition)*moneyReturn;
        System.out.println("收取现金："+acceptCash);
    }
}
