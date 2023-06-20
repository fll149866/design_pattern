package com.example.design_pattern.commandPattern.demo;

/**
 * 抽象命令对象
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/13 15:59
 */
public abstract class Command {

    /**
     * 命令接受者
     */
    protected Barbecuer receiver;

    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }

    /**
     * 执行命令
     */
    public abstract void executeCommand();
}
