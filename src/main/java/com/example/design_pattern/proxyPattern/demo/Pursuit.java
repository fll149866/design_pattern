package com.example.design_pattern.proxyPattern.demo;

/**
 * 追求者
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/25 16:46
 */
public class Pursuit implements GiveGift {

    private Girl girl;

    public Pursuit(Girl girl) {
        this.girl = girl;
    }

    @Override
    public void giveFlower() {
        System.out.println(girl.getName() + "送你鲜花！");
    }

    @Override
    public void giveGift() {
        System.out.println(girl.getName() + "送你礼物！");
    }

    @Override
    public void giveMoney() {
        System.out.println(girl.getName() + "送你钱！");
    }
}
