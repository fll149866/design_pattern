package com.example.design_pattern.facadePattern;

import com.example.design_pattern.facadePattern.demo.Facade;

/**
 * 外观模式
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/19 17:03
 */
public class FacadePatternMain {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
    }
}
