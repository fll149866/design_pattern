package com.example.design_pattern.bridgePattern;

import com.example.design_pattern.bridgePattern.demo.*;

/**
 * 桥接模式
 * 聚合/合成复用原则
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/13 14:33
 */
public class BridgePatternMain {

    public static void main(String[] args) {
        HandsetsBrand hb;
        hb = new HandsetsBrandM();
        hb.setHandsetsSoft(new Game());
        hb.run();
        hb.setHandsetsSoft(new HandSetsAddressList());
        hb.run();

        hb = new HandsetsBrandN();
        hb.setHandsetsSoft(new Game());
        hb.run();
    }
}
