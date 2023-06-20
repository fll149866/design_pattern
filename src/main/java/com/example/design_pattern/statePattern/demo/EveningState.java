package com.example.design_pattern.statePattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/7 14:02
 */
public class EveningState extends State {

    @Override
    public void writeProgram(Work work) {
        if (work.isFinished()) {
            System.out.println("干完！下班！！！");
        } else {
            System.out.println(work.getHour() + "点，还需要加班");
        }
    }
}
