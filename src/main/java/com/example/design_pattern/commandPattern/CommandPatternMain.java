package com.example.design_pattern.commandPattern;

import com.example.design_pattern.commandPattern.demo.BakeChickenWingsCommand;
import com.example.design_pattern.commandPattern.demo.BakeMuttonCommand;
import com.example.design_pattern.commandPattern.demo.Barbecuer;
import com.example.design_pattern.commandPattern.demo.Waiter;

/**
 * 命令模式
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/13 15:56
 */
public class CommandPatternMain {

    public static void main(String[] args) {
        // 烧烤师
        Barbecuer barbecuer = new Barbecuer();
        // 点餐

        BakeChickenWingsCommand chickenWingsCommand = new BakeChickenWingsCommand(barbecuer);
        BakeMuttonCommand bakeMuttonCommand = new BakeMuttonCommand(barbecuer);

        // 服务员记录
        Waiter waiter = new Waiter();
        waiter.addOrder(chickenWingsCommand);
        waiter.addOrder(bakeMuttonCommand);

        // 通知烧烤师
        waiter.notifyReceiver();

        waiter.cancelOrder(chickenWingsCommand);
        BakeMuttonCommand bakeMuttonCommand1 = new BakeMuttonCommand(barbecuer);
        waiter.addOrder(bakeMuttonCommand1);
        waiter.notifyReceiver();

    }
}
