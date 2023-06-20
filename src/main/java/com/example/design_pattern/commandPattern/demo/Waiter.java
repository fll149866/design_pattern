package com.example.design_pattern.commandPattern.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/13 16:06
 */
public class Waiter {

    private List<Command> commands = new ArrayList<>();

    /**
     * 点餐
     */
    public void addOrder(Command command) {
        if (command == null) {
            System.out.println("对不起，暂时没有此物品~");
        } else {
            commands.add(command);
        }
    }

    /**
     * 撤销
     *
     * @param command
     */
    public void cancelOrder(Command command) {
        commands.remove(command);
        System.out.println("取消订单！");
    }

    /**
     * 通知接受者处理命令
     */
    public void notifyReceiver() {
        for (Command c :
                commands) {
            c.executeCommand();
        }
    }
}
