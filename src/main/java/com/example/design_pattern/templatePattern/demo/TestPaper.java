package com.example.design_pattern.templatePattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/26 17:06
 */
public abstract class TestPaper {

    public void question1() {
        System.out.println("这是试题1（）");
        System.out.println("答案：" + answer1());
    }

    public void question2() {
        System.out.println("这是试题1（）");
        System.out.println("答案：" + answer2());
    }

    public void question3() {
        System.out.println("这是试题1（）");
        System.out.println("答案：" + answer3());
    }


    public abstract String answer1();

    public abstract String answer2();

    public abstract String answer3();
}
