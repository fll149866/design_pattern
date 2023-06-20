package com.example.design_pattern.mediatorPattern.demo;

/**
 * 联合国
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/16 16:13
 */
public abstract class UnitedNations {

    /**
     * 声明
     *
     * @param message 消息
     */
    public abstract void declare(String message,Country country);
}
