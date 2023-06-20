package com.example.design_pattern.chainOfResPattern;

import com.example.design_pattern.chainOfResPattern.demo.CommonManager;
import com.example.design_pattern.chainOfResPattern.demo.GeneralManager;
import com.example.design_pattern.chainOfResPattern.demo.Majordomo;
import com.example.design_pattern.chainOfResPattern.demo.Request;

/**
 * 职责链模式
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/16 14:55
 */
public class ChainOfResponsibilityPatternMain {

    public static void main(String[] args) {
        CommonManager commonManager = new CommonManager("唐大");
        Majordomo majordomo = new Majordomo("冯大");
        GeneralManager generalManager = new GeneralManager("老大");
        commonManager.setSuperior(majordomo);
        majordomo.setSuperior(generalManager);

        Request request = new Request();
        request.setRequestType("请假");
        request.setRequestContent("上课，请假一星期！");
        request.setNumber(3);

        commonManager.requestApplication(request);

        Request request1 = new Request();
        request1.setRequestType("请假");
        request1.setRequestContent("上课，请假一星期！");
        request1.setNumber(8);

        commonManager.requestApplication(request1);

        Request request2 = new Request();
        request2.setRequestType("加薪");
        request2.setRequestContent("加薪100！");
        request2.setNumber(10000);

        commonManager.requestApplication(request2);
    }
}
