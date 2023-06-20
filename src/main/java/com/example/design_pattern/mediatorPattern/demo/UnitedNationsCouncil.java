package com.example.design_pattern.mediatorPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/16 16:17
 */
public class UnitedNationsCouncil extends UnitedNations {


    /**
     * 国家1
     */
    private USA colleague1;

    /**
     * 国家2
     */
    private Iraq colleague2;

    public void setColleague1(USA colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(Iraq colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void declare(String message, Country country) {
        if (country == colleague1) {
            // 国家1给国家2带的话
            colleague2.getMessage(message);
        } else {
            colleague1.getMessage(message);
        }
    }
}
