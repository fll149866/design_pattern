package com.example.design_pattern.compositePattern.demo;

/**
 * 部门
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/12 11:02
 */
public class Department extends Company {

    public Department(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        System.out.println("-".repeat(depth) + name);
    }

    @Override
    public void duty() {
        System.out.println("这里是部门！负责相关事务");
    }
}
