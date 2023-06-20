package com.example.design_pattern.decoratorPattern.demoAfter;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/25 15:40
 */
public class Pants extends Finery {

    @Override
    public void show() {
        System.out.println("短裤");
        super.show();
    }
}
