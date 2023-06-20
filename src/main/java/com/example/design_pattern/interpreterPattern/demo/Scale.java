package com.example.design_pattern.interpreterPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/19 14:33
 */
public class Scale extends Expression {

    @Override
    public void execute(String playKey, double playValue) {
        String scale = "";
            switch ((int) playValue) {
                case 1:
                    scale = "低音";
                    break;
                case 2:
                    scale = "中音";
                    break;
                case 3:
                    scale = "高音";
                    break;
            }
        System.out.println(scale);
    }
}
