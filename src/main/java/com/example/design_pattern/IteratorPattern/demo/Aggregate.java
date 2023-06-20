package com.example.design_pattern.IteratorPattern.demo;

/**
 * 聚集类
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/12 15:17
 */
public abstract class Aggregate {

    /**
     * 构建迭代器
     *
     * @return
     */
    public abstract Iterator createIterator();
}
