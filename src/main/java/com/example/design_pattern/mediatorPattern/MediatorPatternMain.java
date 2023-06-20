package com.example.design_pattern.mediatorPattern;

import com.example.design_pattern.mediatorPattern.demo.Iraq;
import com.example.design_pattern.mediatorPattern.demo.USA;
import com.example.design_pattern.mediatorPattern.demo.UnitedNationsCouncil;

/**
 * 中介者模式
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/16 16:12
 */
public class MediatorPatternMain {

    public static void main(String[] args) {
        // 充当中介 联合国理事会
        UnitedNationsCouncil nationsCouncil = new UnitedNationsCouncil();

        // 都认识联合国
        USA usa = new USA(nationsCouncil);
        Iraq iraq = new Iraq(nationsCouncil);

        // 联合国认识两个国家
        nationsCouncil.setColleague1(usa);
        nationsCouncil.setColleague2(iraq);

        // 两个国家发表声明
        usa.declare("停止开发核武器，否则接受打击");
        iraq.declare("我们没有开发核武器，也不怕侵略！");

    }
}
