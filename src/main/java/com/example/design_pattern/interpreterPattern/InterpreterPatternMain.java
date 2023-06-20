package com.example.design_pattern.interpreterPattern;

import com.example.design_pattern.interpreterPattern.demo.Expression;
import com.example.design_pattern.interpreterPattern.demo.Note;
import com.example.design_pattern.interpreterPattern.demo.PlayContext;
import com.example.design_pattern.interpreterPattern.demo.Scale;

/**
 * 解释器模式
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/19 14:10
 */
public class InterpreterPatternMain {

    public static void main(String[] args) {

        PlayContext context = new PlayContext();
        context.setPlayText("O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 ");
        Expression expression;
        while (!context.getPlayText().isBlank()){
            String str = context.getPlayText().substring(0, 1);
            switch (str){
                case "O":
                    expression = new Scale();
                    break;
                default:
                    expression = new Note();
                    break;
            }
            expression.intercept(context);
        }

    }
}
