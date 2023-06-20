package com.example.design_pattern.proxyPattern.demo;

/**
 * 被追求者
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/25 16:47
 */
public class Girl {

    private String name;

    public Girl(String name) {
        this.name = name;
    }

    public Girl() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
