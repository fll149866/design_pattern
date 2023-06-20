package com.example.design_pattern.visitorPattern;

import com.example.design_pattern.visitorPattern.demo.Man;
import com.example.design_pattern.visitorPattern.demo.ObjectStructure;
import com.example.design_pattern.visitorPattern.demo.Success;
import com.example.design_pattern.visitorPattern.demo.Woman;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/19 15:26
 */
public class VisitorPatternMain {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new Woman());
        objectStructure.add(new Man());

        Success success = new Success();
        objectStructure.display(success);
    }
}
