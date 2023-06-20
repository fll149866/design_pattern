package com.example.design_pattern.adapterPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/10 15:18
 */
public class Forwards extends Player {

    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("前锋[" + name + "]，进攻！");
    }

    @Override
    public void defense() {
        System.out.println("前锋防守[" + name + "]，防守！");
    }
}
