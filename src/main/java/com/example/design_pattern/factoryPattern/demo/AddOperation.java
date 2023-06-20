package com.example.design_pattern.factoryPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/13 19:52
 */
public class AddOperation extends Operation {

    /**
     * 加法运算
     *
     * @return
     */
    @Override
    public Double getResult() {
        return this.getNumberA() + this.getNumberB();
    }
}
