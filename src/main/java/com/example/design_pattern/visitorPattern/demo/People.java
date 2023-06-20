package com.example.design_pattern.visitorPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/19 15:27
 */
public abstract class People {


    /**
     * 男女态度
     *
     * @param visitor
     */
    public abstract void accept(Action visitor);
}
