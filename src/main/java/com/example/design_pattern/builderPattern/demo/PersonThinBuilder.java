package com.example.design_pattern.builderPattern.demo;

/**
 * 瘦人物构造
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/29 15:35
 */
public class PersonThinBuilder extends PersonBuilder {

    @Override
    public void buildHead() {
        System.out.println("头部");
    }

    @Override
    public void buildBody() {
        System.out.println("瘦身体");
    }

    @Override
    public void buildArmLeft() {
        System.out.println("左手臂构造");
    }

    @Override
    public void buildArmRight() {
        System.out.println("右手臂构造");
    }

    @Override
    public void buildFootLeft() {
        System.out.println("左腿构造");
    }

    @Override
    public void buildFootRight() {
        System.out.println("右腿构造");
    }
}
