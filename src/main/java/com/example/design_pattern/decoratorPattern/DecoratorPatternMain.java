package com.example.design_pattern.decoratorPattern;


import com.example.design_pattern.decoratorPattern.demoAfter.*;

/**
 * 装饰模式
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/25 14:47
 */
public class DecoratorPatternMain {

    public static void main(String[] args) {
        System.out.println("装饰模式：");
        Person person = new Person("小明");
        // 服饰搭配
        System.out.println("搭配1");
        Finery finery = new Finery();
        TShirts tShirts = new TShirts();
        Shoes shoes = new Shoes();
        Pants pants = new Pants();
        finery.decorator(person);
        tShirts.decorator(finery);
        pants.decorator(tShirts);
        shoes.decorator(pants);
        shoes.show();
    }
}
