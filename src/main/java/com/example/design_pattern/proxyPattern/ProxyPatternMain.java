package com.example.design_pattern.proxyPattern;

import com.example.design_pattern.proxyPattern.demo.Girl;
import com.example.design_pattern.proxyPattern.demo.Proxy;

/**
 * 代理模式
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/25 16:28
 */
public class ProxyPatternMain {


    public static void main(String[] args) {
        Girl girl = new Girl("小美");
        Proxy proxy = new Proxy(girl);
        proxy.giveFlower();
        proxy.giveGift();
        proxy.giveMoney();
    }
}
