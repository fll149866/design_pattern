package com.example.design_pattern.adapterPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/10 15:27
 */
public class ForeignCenter {

    private String name;


    public void 进攻() {
        System.out.println("外籍球员[" + name + "],进攻！");
    }

    public void 防守() {
        System.out.println("外籍球员[" + name + "],防守！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
