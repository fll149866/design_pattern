package com.example.design_pattern.adapterPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/10 15:20
 */
public class Center extends Player {

    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("中锋[" + name + "]，进攻！");
    }

    @Override
    public void defense() {
        System.out.println("中锋[" + name + "]，防守！");
    }
}
