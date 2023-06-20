package com.example.design_pattern.strategyPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/19 16:25
 */
public abstract class CashSuper {

    /**
     * 收取现金的策略
     *
     * @param money - 收取现金
     */
    public abstract void acceptCash(Double money);
}
