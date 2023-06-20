package com.example.design_pattern.proxyPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/25 16:50
 */
public class Proxy implements GiveGift {

    private Pursuit pursuit;

    public Proxy(Girl girl) {
        // 追求的人
        pursuit = new Pursuit(girl);
    }


    @Override
    public void giveFlower() {
        pursuit.giveFlower();
    }

    @Override
    public void giveGift() {
        pursuit.giveGift();
    }

    @Override
    public void giveMoney() {
        pursuit.giveMoney();
    }
}
