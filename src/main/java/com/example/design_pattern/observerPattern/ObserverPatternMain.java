package com.example.design_pattern.observerPattern;

import com.example.design_pattern.observerPattern.demo01.ObserverA;
import com.example.design_pattern.observerPattern.demo01.SubjectA;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;


/**
 * 观察者模式（又名发布-订阅模式）
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/29 18:26
 */
public class ObserverPatternMain {

    public static void main(String[] args) {
        // 主题
        SubjectA subjectA = new SubjectA();
        // 需要通知观察者
        ObserverA observerA = new ObserverA("大胆", subjectA);

        subjectA.setAction("老板回来啦！");
        subjectA.addObservers(observerA);
        // 发起通知
        subjectA.notifyObservers();

    }


    @Test
    public void testSupply(){

        
    }
}
