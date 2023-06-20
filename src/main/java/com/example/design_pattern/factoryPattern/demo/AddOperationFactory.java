package com.example.design_pattern.factoryPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/26 11:40
 */
public class AddOperationFactory implements OperationFactory{

    @Override
    public Operation createOps() {
        return new AddOperation();
    }
}
