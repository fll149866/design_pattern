package com.example.design_pattern.visitorPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/19 15:31
 */
public class Success extends Action {

    @Override
    public void manConclusion(Man man) {
        System.out.println("背后有个强大的女人！");
    }

    @Override
    public void womanConclusion(Woman woman) {
        System.out.println("个人素质优秀！");
    }
}
