package com.example.design_pattern.strategyPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/19 16:36
 */
public class CashStrategy {

    private CashSuper cashSuper;

    /**
     * @param cashStrategyType - 现金收取策略
     */
    public CashStrategy(String cashStrategyType) {
        switch (cashStrategyType) {
            case "无优惠":
                this.cashSuper = new CashNormal();
                break;
            case "满减":
                this.cashSuper = new CashReturn(300D, 100D);
                break;
            case "打折优惠":
                // 打八折
                this.cashSuper = new CashRebate(0.8);
                break;
            default:
                System.out.println("暂无此优惠方式");
                break;
        }
    }

    /**
     * 返回收取结果
     *
     * @param money - 现金
     */
    public void getRes(Double money) {
        this.cashSuper.acceptCash(money);
    }
}
