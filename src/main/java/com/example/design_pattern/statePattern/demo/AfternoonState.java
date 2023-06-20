package com.example.design_pattern.statePattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/7 13:58
 */
public class AfternoonState extends State {

    /**
     * 下午状态
     *
     * @param work
     */
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 18) {
            System.out.println(work.getHour() + "点，精力恢复中，赶快上班！");
        } else {
            // 转为加班状态继续执行
            work.setWorkState(new EveningState());
            work.writeProgram();
        }
    }
}
