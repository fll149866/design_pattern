package com.example.design_pattern.visitorPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/19 15:28
 */
public abstract class Action {


    /**
     * 男人的结论
     *
     * @param man
     */
    public abstract void manConclusion(Man man);

    /**
     * 女人的结论
     *
     * @param woman
     */
    public abstract void womanConclusion(Woman woman);
}
