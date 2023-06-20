package com.example.design_pattern.bridgePattern.demo;

/**
 * 手机厂商
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/13 14:36
 */
public abstract class HandsetsBrand {

    /**
     * 手机软件
     */
    protected HandsetsSoft handsetsSoft;


    public void setHandsetsSoft(HandsetsSoft handsetsSoft) {
        this.handsetsSoft = handsetsSoft;
    }

    /**
     * 运行软件
     */
    public abstract void run();
}
