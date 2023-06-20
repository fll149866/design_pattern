package com.example.design_pattern.visitorPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/19 15:30
 */
public class Man extends People {

    @Override
    public void accept(Action visitor) {
        visitor.manConclusion(this);
    }
}
