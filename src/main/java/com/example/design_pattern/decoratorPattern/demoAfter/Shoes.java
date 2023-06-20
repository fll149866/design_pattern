package com.example.design_pattern.decoratorPattern.demoAfter;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/25 15:41
 */
public class Shoes extends Finery {

    @Override
    public void show() {
        System.out.println("运动鞋");
        // 调用父类
        super.show();
    }
}
