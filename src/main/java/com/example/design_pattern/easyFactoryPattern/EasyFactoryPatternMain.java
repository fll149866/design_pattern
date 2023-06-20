package com.example.design_pattern.easyFactoryPattern;

/**
 * 简单工厂模式
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/13 19:54
 */
public class EasyFactoryPatternMain {

    public static void main(String[] args) {
        double numberA = 12;
        double numberB = 13;
        Operation opr;
        opr = OperationFactory.createOperation("-");
        opr.setNumberA(numberA);
        opr.setNumberB(numberB);
        System.out.println(opr.getResult());
    }
}
