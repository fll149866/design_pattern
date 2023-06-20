package com.example.design_pattern.observerPattern.demo01;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/29 18:39
 */
public class ObserverA extends Observer{

    /**
     * 名称
     */
    private String name;

    private Subject subject;

    public ObserverA(String name,Subject subject){
        this.name = name;
        this.subject = subject;
    }


    @Override
    public void updateState() {
        System.out.printf(subject.getAction()+","+name+"赶快准备好!");
    }
}
