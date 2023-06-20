package com.example.design_pattern.IteratorPattern.demo;


/**
 * 迭代器
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/12 15:14
 */
public abstract class Iterator {

    /**
     * 第一个元素
     *
     * @return
     */
    public abstract Object first();

    /**
     * 下一个元素
     *
     * @return
     */
    public abstract Object next();

    /**
     * 是否迭代完成
     *
     * @return
     */
    public abstract boolean isDone();

    /**
     * 当前元素
     *
     * @return
     */
    public abstract Object currentItem();
}
