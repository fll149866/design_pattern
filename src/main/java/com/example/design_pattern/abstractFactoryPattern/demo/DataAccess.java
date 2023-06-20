package com.example.design_pattern.abstractFactoryPattern.demo;


/**
 * 反射+简单工厂模式 优化抽象工厂模式
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/5 15:14
 */
public class DataAccess <T>{


    /**
     * 数据库驱动名称
     */
    public String driverName = "sql";

    /**
     * 创建访问类
     *
     * @return
     */
    public T createAccess() {
        try {
           return (T) Class.forName(driverName).getConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("未找到该数据驱动名称:"+e);
        }
    }
}
