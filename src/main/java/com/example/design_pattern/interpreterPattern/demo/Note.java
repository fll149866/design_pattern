package com.example.design_pattern.interpreterPattern.demo;

/**
 * 音符
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/19 14:36
 */
public class Note extends Expression {

    @Override
    public void execute(String playKey, double playValue) {
        String note = "";
        switch (playKey) {
            case "C":
                note = "1";
                break;
            case "D":
                note = "2";
                break;
            case "E":
                note = "3";
                break;
            case "F":
                note = "4";
                break;
            case "G":
                note = "5";
                break;
            case "A":
                note = "6";
                break;
            case "B":
                note = "7";
                break;
        }
        System.out.println(note);
    }
}
