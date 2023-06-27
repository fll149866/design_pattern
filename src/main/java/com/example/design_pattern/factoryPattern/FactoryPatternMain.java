package com.example.design_pattern.factoryPattern;

import com.example.design_pattern.factoryPattern.demo.AddOperationFactory;
import com.example.design_pattern.factoryPattern.demo.Operation;
import com.example.design_pattern.factoryPattern.demo02.Pay;
import com.example.design_pattern.factoryPattern.demo02.PayFactory;
import com.example.design_pattern.factoryPattern.demo03.AliPayFactory;
import com.example.design_pattern.factoryPattern.demo03.WechatPayFactory;
import com.example.design_pattern.factoryPattern.demo1.EasyFactory;
import com.example.design_pattern.factoryPattern.demo1.FactoryPattern;
import com.example.design_pattern.factoryPattern.demo1.LeiFeng;
import com.example.design_pattern.factoryPattern.demo1.UngradedStudentFactory;
import org.junit.jupiter.api.Test;

/**
 * 工厂模式
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/26 11:33
 */
public class FactoryPatternMain {

    public static void main(String[] args) {
        Operation addOps = new AddOperationFactory().createOps();
        addOps.setNumberA(12D);
        addOps.setNumberB(13D);
        System.out.println(addOps.getResult());
    }


    @Test
    public void testFactory() {
        // 简单工厂模式
        LeiFeng student = new EasyFactory().createLeiFeng("学生");
        student.clean();
        student.swap();
        LeiFeng volunteer = new EasyFactory().createLeiFeng("志愿者");
        volunteer.clean();
        volunteer.swap();

        // 工厂方法模式
        FactoryPattern pattern = new UngradedStudentFactory();
        LeiFeng leiFeng = pattern.createLeiFeng();
        leiFeng.clean();
        leiFeng.swap();

    }

    @Test
    public void testDemo02() {
        Pay wechatPay = PayFactory.createPay("wechat");
        wechatPay.unifiedOrder();
    }

    /**
     * 测试工厂方法模式
     */
    @Test
    public void testDemo03() {
        Pay pay = new WechatPayFactory().getPay();
        pay.unifiedOrder();
        Pay pay1 = new AliPayFactory().getPay();
        pay1.unifiedOrder();
    }
}
