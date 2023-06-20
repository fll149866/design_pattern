package com.example.design_pattern.easyFactoryPattern;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/15 18:12
 */
public class SubOperation extends Operation{

    /**
     * 减法
     * @return
     */
    @Override
    public Double getResult() {
        return getNumberA()-getNumberB();
    }
}
