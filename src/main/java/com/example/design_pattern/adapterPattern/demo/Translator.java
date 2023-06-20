package com.example.design_pattern.adapterPattern.demo;

/**
 * 翻译，充当适配
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/10 15:29
 */
public class Translator extends Player {

    private ForeignCenter foreignCenter;

    public Translator(String name) {
        super(name);
        this.foreignCenter = new ForeignCenter();
        foreignCenter.setName(name);
    }

    /**
     * 进行适配
     */
    @Override
    public void attack() {
        foreignCenter.进攻();
    }

    @Override
    public void defense() {
        foreignCenter.防守();
    }
}
