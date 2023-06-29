package com.example.design_pattern.adapterPattern.demo01;

/**
 * 继承老模块，实现新模块
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/28 17:10
 */
public class ModuleAdapter extends OldModule implements TargetModule {

    @Override
    public void methodB() {
        System.out.println(" TargetModule B");
    }

    @Override
    public void methodC() {
        System.out.println(" TargetModule C");
    }
}
