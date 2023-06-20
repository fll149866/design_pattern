package com.example.design_pattern.commandPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/13 16:01
 */
public class BakeMuttonCommand extends Command{


    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.bakeMutton();
    }
}
