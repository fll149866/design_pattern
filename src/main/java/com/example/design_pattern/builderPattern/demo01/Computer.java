package com.example.design_pattern.builderPattern.demo01;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/28 11:10
 */
public class Computer {

    private String memory;

    private String brand;

    private String cpu;

    @Override
    public String toString() {
        return "Computer{" +
                "memory='" + memory + '\'' +
                ", brand='" + brand + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
}
