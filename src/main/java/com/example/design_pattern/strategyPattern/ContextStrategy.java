package com.example.design_pattern.strategyPattern;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/19 16:16
 */
public class ContextStrategy {

    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public ContextStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 上下文接口
     */
    public void contextInterface() {
        strategy.algorithm();
    }
}
