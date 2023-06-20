package com.example.design_pattern.decoratorPattern.demoAfter;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/25 14:53
 */
public class Person {

    /**
     * 姓名
     */
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    /**
     * 服饰展示
     */
    public void show() {
        System.out.println("名称：" + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
