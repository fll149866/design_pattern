package com.example.design_pattern.singletonPattern.demo;

/**
 * 饿汉式
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/12 16:55
 */
public class HungrySingleton {

    /**
     * 使用static关键字静态加载，即在类加载时便进行实例
     * 不会出现线程冲突，但会提前占用系统资源
     */
    private final static HungrySingleton instance = new HungrySingleton();

    /**
     * 私有化构造器，无法直接进行实例化
     */
    private HungrySingleton() {
    }

    /**
     * 访问实例对象唯一的开口
     *
     * @return
     */
    public static HungrySingleton getInstance() {
        return instance;
    }
}
