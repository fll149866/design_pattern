package com.example.design_pattern.builderPattern.demo;

/**
 * 人物构造器
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/29 15:32
 */
public abstract class PersonBuilder {

    /**
     * 头部构造
     */
    public abstract void buildHead();

    /**
     * 身体构造
     */
    public abstract void buildBody();

    /**
     * 左臂构造
     */
    public abstract void buildArmLeft();

    /**
     * 右臂构造
     */
    public abstract void buildArmRight();

    /**
     * 左腿构造
     */
    public abstract void buildFootLeft();

    /**
     * 右腿构造
     */
    public abstract void buildFootRight();
}
