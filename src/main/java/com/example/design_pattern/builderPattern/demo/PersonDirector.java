package com.example.design_pattern.builderPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/29 15:37
 */
public class PersonDirector {

    private PersonBuilder personBuilder;

    public PersonDirector(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }

    /**
     * 将构造过程进行处理
     */
    public void createPerson() {
        this.personBuilder.buildHead();
        this.personBuilder.buildBody();
        this.personBuilder.buildArmLeft();
        this.personBuilder.buildArmRight();
        this.personBuilder.buildFootLeft();
        this.personBuilder.buildFootRight();
    }
}
