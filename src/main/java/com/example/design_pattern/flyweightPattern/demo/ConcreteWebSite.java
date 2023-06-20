package com.example.design_pattern.flyweightPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/19 13:25
 */
public class ConcreteWebSite extends WebSite {

    private String name;

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println("系统名称：" + name + "，用户：" + user.getName());
    }
}
