package com.example.design_pattern.statePattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/7 13:45
 */
public class Work {

    /**
     * 工作状态
     */
    private State workState;

    /**
     * 工作时间
     */
    private int hour;

    /**
     * 是否完成工作
     */
    private boolean isFinished = false;

    public Work() {
        // 初始化为早上状态
        this.workState = new ForenoonState();
    }

    /**
     * 写程序
     */
    public void writeProgram(){
        this.workState.writeProgram(this);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setWorkState(State workState) {
        this.workState = workState;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

}
