package com.example.design_pattern.facadePattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/19 17:05
 */
public class Facade {

    SubSystemOne one;

    SubSystemTwo two;

    SubSystemThree three;

    public Facade() {
        one = new SubSystemOne();
        three = new SubSystemThree();
        two = new SubSystemTwo();
    }

    public void methodA() {
        System.out.println("方法组A。。。");
        one.methodOne();
        two.methodTwo();
    }
}
