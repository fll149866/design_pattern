package com.example.design_pattern.builderPattern.demo01;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/28 11:21
 */
public class ComputerDirector {

    public Computer createComputer(Builder builder){
       return builder.cpu().brand().memory().getComputer();
    }
}
