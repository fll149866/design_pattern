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


    /**
     * DCL 双重检查锁定（Double-Checked-Locking)，在多线程情况下保持高性能
     * 1.
     *
     * @return
     */
    public static SafeLazySingleton getSafeInstance() {
        if (instance == null) {
            // 防止多个线程同时进入
            synchronized (lock) {
                // 依次进入进行判断
                if (instance == null) {
                    System.out.println(Thread.currentThread().getName());
                    instance = new SafeLazySingleton();
                }
            }
        }
        return instance;
    }

    /**
     * 线程安全，但锁粒度太大，性能较差
     *
     * @return
     */
    /*public static SafeLazySingleton getSafeInstance() {
        if (instance == null) {
            // 防止多个线程同时进入
            synchronized (lock) {
                // 依次进入进行判断
                if (instance == null) {
                    System.out.println(Thread.currentThread().getName());
                    instance = new SafeLazySingleton();
                }
            }
        }
        return instance;
    }*/

}
