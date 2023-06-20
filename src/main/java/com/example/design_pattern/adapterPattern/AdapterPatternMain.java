package com.example.design_pattern.adapterPattern;

import com.example.design_pattern.adapterPattern.demo.Center;
import com.example.design_pattern.adapterPattern.demo.Forwards;
import com.example.design_pattern.adapterPattern.demo.Translator;

/**
 * 适配器模式
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/10 15:16
 */
public class AdapterPatternMain {


    public static void main(String[] args) {
        Center jack = new Center("Jack");
        jack.attack();
        jack.defense();
        Forwards martin = new Forwards("Martin");
        martin.attack();
        martin.defense();
        Translator ym = new Translator("姚明");
        ym.attack();
        ym.defense();

    }
}
