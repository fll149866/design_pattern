package com.example.design_pattern.factoryPattern.demo1;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/26 14:28
 */
public class UngradedStudentFactory implements FactoryPattern{

    @Override
    public LeiFeng createLeiFeng() {
        return new UnGradedStudent();
    }
}
