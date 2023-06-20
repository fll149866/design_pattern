package com.example.design_pattern.statePattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/7 13:57
 */
public class NoonState extends State {

    /**
     * 中午状态
     *
     * @param work
     */
    @Override
    public void writeProgram(Work work) {
        if (work.getHour()<13){
            System.out.println(work.getHour()+"点，好饿，好想休息");
        }else {
            work.setWorkState(new AfternoonState());
            work.writeProgram();
        }
    }
}
