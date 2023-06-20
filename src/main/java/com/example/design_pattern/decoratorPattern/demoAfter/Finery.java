package com.example.design_pattern.decoratorPattern.demoAfter;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/25 15:28
 */
public class Finery extends Person {


    /**
     * 装扮属性
     */
    private Person personDecorator;


    /**
     * 装扮
     *
     * @param personDecorator
     */
    public void decorator(Person personDecorator) {
        this.personDecorator = personDecorator;
    }


    /**
     * 服装展示
     */
    public void show() {
        if (personDecorator != null) {
            personDecorator.show();
        }
    }


    public Person getPersonDecorator() {
        return personDecorator;
    }

    public void setPersonDecorator(Person personDecorator) {
        this.personDecorator = personDecorator;
    }
}
