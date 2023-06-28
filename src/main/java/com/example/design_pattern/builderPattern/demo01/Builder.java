package com.example.design_pattern.builderPattern.demo01;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/28 11:11
 */
public abstract class Builder {

    protected Computer computer = new Computer();

    public abstract Builder cpu();

    public abstract Builder memory();

    public abstract Builder brand();

    public Computer getComputer() {
        return computer;
    }
}
