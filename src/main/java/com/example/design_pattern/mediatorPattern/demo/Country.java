package com.example.design_pattern.mediatorPattern.demo;

/**
 * 国家
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/16 16:14
 */
public abstract class Country {

    /**
     * 中介者
     */
    protected UnitedNations mediator;

    public Country(UnitedNations mediator) {
        this.mediator = mediator;
    }
}
