package com.example.design_pattern.factoryPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/13 19:47
 */
public class Operation {

    /**
     * 数字A
     */
    private Double numberA;


    /**
     * 数字b
     */
    private Double numberB;


    /**
     * 获取运算结果
     *
     * @return
     */
    public Double getResult() {
        return  null;
    }


    public Operation(Double numberA, Double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public Operation() {
    }

    public Double getNumberA() {
        return numberA;
    }

    public void setNumberA(Double numberA) {
        this.numberA = numberA;
    }

    public Double getNumberB() {
        return numberB;
    }

    public void setNumberB(Double numberB) {
        this.numberB = numberB;
    }
}
