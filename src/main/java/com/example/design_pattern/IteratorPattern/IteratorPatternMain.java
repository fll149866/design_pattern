package com.example.design_pattern.IteratorPattern;

import com.example.design_pattern.IteratorPattern.demo.Aggregate;
import com.example.design_pattern.IteratorPattern.demo.ConcreteAggregate;
import com.example.design_pattern.IteratorPattern.demo.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 迭代器模式
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/12 15:14
 */
public class IteratorPatternMain {

    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        List<Object> list = new ArrayList<>();
        list.add("大小");
        list.add("大小1");
        list.add("大小2");
        list.add("大小3");
        aggregate.setList(list);


        // 创建迭代器
        Iterator iterator = aggregate.createIterator();
        System.out.println(iterator.first());
        while (!iterator.isDone()){
            System.out.println(iterator.currentItem()+"，请卖票！");
        }

    }
}
