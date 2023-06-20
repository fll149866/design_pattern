package com.example.design_pattern.interpreterPattern.demo;

/**
 * 解释表达式
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/19 14:12
 */
public abstract class Expression {

    /**
     * 解释器
     */
    public void intercept(PlayContext context) {
        if (context.getPlayText().isBlank()) {
            return;
        } else {
            String playkey = context.getPlayText().substring(0, 1);
            context.setPlayText(context.getPlayText().substring(2));
            double playValue = Double.parseDouble(context.getPlayText().substring(0, context.getPlayText().indexOf(" ")));
            // 将前面两者移除
            context.setPlayText(context.getPlayText().substring(context.getPlayText().indexOf(" ") + 1));
            execute(playkey, playValue);
        }
    }

    /**
     * 执行
     *
     * @param playKey
     * @param playValue
     */
    public abstract void execute(String playKey, double playValue);
}
