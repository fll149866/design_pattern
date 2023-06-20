package com.example.design_pattern.commandPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/13 16:01
 */
public class BakeChickenWingsCommand extends Command{


    public BakeChickenWingsCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.bakeChickenWings();
    }
}
