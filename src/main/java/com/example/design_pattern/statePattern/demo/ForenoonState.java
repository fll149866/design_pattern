package com.example.design_pattern.statePattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/7 13:44
 */
public class ForenoonState extends State {

    /**
     * 上午写程序状态
     */
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 12) {
            System.out.println("干劲十足，效率十足，抓紧时间干！");
        } else {
            // 转为午时状态
            work.setWorkState(new NoonState());
            work.writeProgram();
        }
    }
}
