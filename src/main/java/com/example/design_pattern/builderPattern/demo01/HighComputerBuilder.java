package com.example.design_pattern.builderPattern.demo01;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/28 11:17
 */
public class HighComputerBuilder extends Builder {

    @Override
    public Builder cpu() {
        computer.setCpu("高配 CPU");
        return this;
    }

    @Override
    public Builder memory() {
        computer.setMemory("高配 内存");
        return this;
    }

    @Override
    public Builder brand() {
        computer.setBrand("苹果");
        return this;
    }
}
