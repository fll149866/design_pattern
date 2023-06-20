package com.example.design_pattern.singletonPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/12 17:02
 */
public class LazySingleton {

    /**
     * 懒加载，第一次引用时进行实例化
     */
    private static LazySingleton instance = null;


    private LazySingleton() {

    }

    public static LazySingleton getInstance(){
        if (instance==null){
            instance = new LazySingleton();
        }
        return instance;
    }

}
