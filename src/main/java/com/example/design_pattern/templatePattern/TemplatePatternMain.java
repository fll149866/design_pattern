package com.example.design_pattern.templatePattern;

import com.example.design_pattern.templatePattern.demo.TestPaper;
import com.example.design_pattern.templatePattern.demo.TestPaperA;
import com.example.design_pattern.templatePattern.demo.TestPaperB;

/**
 * 模板方法模式
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/26 17:06
 */
public class TemplatePatternMain {

    public static void main(String[] args) {
        System.out.println("A同学试卷答题情况：");
        TestPaper testPaperA = new TestPaperA();
        testPaperA.question1();
        testPaperA.question2();
        testPaperA.question3();

        System.out.println("B同学试卷答题情况：");
        TestPaper testPaperB = new TestPaperB();
        testPaperB.question1();
        testPaperB.question2();
        testPaperB.question3();
    }
}
