package com.example.design_pattern.prototypePattern.demo01;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/27 21:20
 */
public class Demo01Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        person.setAge(18);
        person.setName("GGBOM");
        person.getList().add("AA");

        // 浅拷贝
//        Person person1 = person.clone();
        // 深拷贝
        Person person1 = person.deepClone();
        person1.setName("HH");
        person1.getList().add("BB");

        System.out.println("name=" + person.getName() + ",age=" + person.getAge() + ",list=" + person.getList());
        System.out.println("name=" + person1.getName() + ",age=" + person1.getAge() + ",list=" + person1.getList());
    }
}
