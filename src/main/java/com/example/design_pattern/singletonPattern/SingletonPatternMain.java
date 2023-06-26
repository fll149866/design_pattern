package com.example.design_pattern.singletonPattern;

import com.example.design_pattern.singletonPattern.demo.HungrySingleton;
import com.example.design_pattern.singletonPattern.demo.LazySingleton;
import com.example.design_pattern.singletonPattern.demo.SafeLazySingleton;
import org.junit.jupiter.api.Test;

/**
 * 单例模式
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/12 16:54
 */
public class SingletonPatternMain {

    public static void main(String[] args) {
        // 饿汉式单例模式，线程安全但是性能较差
        System.out.println("饿汉式单例模式");
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
        System.out.println(hungrySingleton1 == hungrySingleton);

        System.out.println("懒汉式单例模式");
        // 存在线程访问冲突
        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        System.out.println(lazySingleton1 == lazySingleton);


    }


    @Test
    public void testSafe() {
        for (int i = 0; i < 20; i++) {
            Thread thread = new Thread(SafeLazySingleton::getSafeInstance);
            thread.setName(i + "");
            thread.start();
        }
    }
}
