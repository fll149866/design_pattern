package com.example.design_pattern.builderPattern;

import com.example.design_pattern.builderPattern.demo.PersonDirector;
import com.example.design_pattern.builderPattern.demo.PersonThinBuilder;

/**
 * 构造者模式
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/29 15:32
 */
public class BuilderPatternMain {

    public static void main(String[] args) {
        PersonThinBuilder thinBuilder = new PersonThinBuilder();
        // 人物向导
        PersonDirector personDirector = new PersonDirector(thinBuilder);
        personDirector.createPerson();
    }
}
