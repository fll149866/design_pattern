package com.example.design_pattern.factoryPattern.demo1;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/26 14:19
 */
public class EasyFactory {

    /**
     * 构建雷锋实例
     *
     * @param type
     * @return
     */
    public LeiFeng createLeiFeng(String type) {
        LeiFeng leiFeng = null;
        switch (type) {
            case "学生":
                leiFeng = new UnGradedStudent();
                break;
            case "志愿者":
                leiFeng = new Volunteer();
                break;
        }
        return leiFeng;
    }
}
