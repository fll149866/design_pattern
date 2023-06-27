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
     * 1.分配空间给对象
     * 2.在空间内创建对象
     * 3.将对象赋值给引用instance
     * <p>
     * 其中2和3的顺序不定，如果3比2先进行，把值写入主内存，其他线程就会读取到instance的最新值，但是这个最新值并不完整
     * （指令重排）
     * 锁的粒度小
     *
     * @return
     */
    public static SafeLazySingleton getSafeInstance() {
        // 第一次检查
        if (instance == null) {
            // 防止多个线程同时进入 A B线程
            synchronized (lock) {
                // 依次进入进行判断
                // 第二次检查
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
