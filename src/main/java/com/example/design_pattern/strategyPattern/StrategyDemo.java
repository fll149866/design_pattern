package com.example.design_pattern.strategyPattern;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/19 15:40
 */
public class StrategyDemo {
    // 商场收银软件

    /**
     * 计算总价
     *
     * @param num   - 商品数量
     * @param price - 商品单价
     */
    public void computeTotalPrice(Double num, Double price) {
        double totalPrice = num * price;
        System.out.println("商品总价：" + totalPrice);
    }
}
