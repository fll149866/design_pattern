package com.example.design_pattern.factoryPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/26 11:41
 */
public class SubOperationFactory implements OperationFactory{

    @Override
    public Operation createOps() {
        return new SubOperation();
    }
}
