package com.example.design_pattern.factoryPattern.demo;

/**
 * 运算工厂
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/26 11:37
 */
public interface OperationFactory {

    /**
     * 进行运算的方法
     *
     * @return
     */
    Operation createOps();
}
