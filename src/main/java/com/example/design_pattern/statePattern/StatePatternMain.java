package com.example.design_pattern.statePattern;

import com.example.design_pattern.statePattern.demo.Work;

/**
 * 状态模式
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/7 13:41
 */
public class StatePatternMain {

    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(9);
        work.writeProgram();
        work.setHour(12);
        work.writeProgram();
        work.setHour(15);
        work.writeProgram();
        work.setHour(19);
        work.setFinished(true);
        work.writeProgram();
    }
}
