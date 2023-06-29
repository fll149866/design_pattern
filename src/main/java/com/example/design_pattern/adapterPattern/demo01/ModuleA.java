package com.example.design_pattern.adapterPattern.demo01;

/**
 * 该方式可以选择性实现旧模块的方法
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/28 17:14
 */
public class ModuleA extends ModuleImpl {

    @Override
    public void testB() {
        System.out.println("实现B");
    }
}
