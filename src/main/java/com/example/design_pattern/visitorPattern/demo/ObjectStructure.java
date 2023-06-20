package com.example.design_pattern.visitorPattern.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/19 15:33
 */
public class ObjectStructure {

    private final List<People> peopleList = new ArrayList<>();

    /**
     * 添加
     *
     * @param people
     */
    public void add(People people) {
        peopleList.add(people);
    }

    /**
     * 删除
     *
     * @param people
     */
    public void remove(People people) {
        peopleList.remove(people);
    }

    /**
     * 结果展示
     */
    public void display(Action visitor) {
        for (People p :
                peopleList) {
            p.accept(visitor);
        }
    }
}
