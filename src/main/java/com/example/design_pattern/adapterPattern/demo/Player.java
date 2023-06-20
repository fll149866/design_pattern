package com.example.design_pattern.adapterPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/10 15:16
 */
public abstract class Player {

    /**
     * 名称
     */
    String name;

    public Player(String name){
        this.name = name;
    }

    /**
     * 进攻
     */
    public abstract void attack();

    /**
     * 防守
     */
    public abstract void defense();
}
