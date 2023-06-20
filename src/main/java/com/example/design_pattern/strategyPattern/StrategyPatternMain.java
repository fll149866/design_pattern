package com.example.design_pattern.strategyPattern;

/**
 * 策略模式
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/19 16:19
 */
public class StrategyPatternMain {

    public static void main(String[] args) {
        ContextStrategy strategyA = new ContextStrategy(new ContextStrategyA());
        strategyA.contextInterface();
        ContextStrategy strategyB = new ContextStrategy(new ContextStrategyB());
        strategyB.contextInterface();
    }
}
