package com.example.design_pattern.singletonPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/12 17:02
 */
public class SafeLazySingleton {

    /**
     * 懒加载，第一次引用时进行实例化
     */
    private static volatile SafeLazySingleton instance = null;

    private final static Object lock = new Object();


    private SafeLazySingleton() {

    }

    public static SafeLazySingleton getInstance() {
        if (instance == null) {
            // 防止多个线程同时进入
            synchronized (lock) {
                // 依次进入进行判断
                if (instance == null) {
                    instance = new SafeLazySingleton();
                }
            }
        }
        return instance;
    }

}
