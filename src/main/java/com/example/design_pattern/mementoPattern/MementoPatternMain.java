package com.example.design_pattern.mementoPattern;

import com.example.design_pattern.mementoPattern.demo.GameRole;
import com.example.design_pattern.mementoPattern.demo.RoleStateCaretaker;

/**
 * 备忘录模式
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/12 9:48
 */
public class MementoPatternMain {

    public static void main(String[] args) {
        // 创建角色
        GameRole gameRole = new GameRole();
        gameRole.initState();
        System.out.println(gameRole);

        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        // 保存状态
        roleStateCaretaker.setRoleStateMemento(gameRole.saveState());

        // 打架
        gameRole.fight();
        System.out.println(gameRole);

        // 恢复状态
        gameRole.recoveryState(roleStateCaretaker.getRoleStateMemento());
        System.out.println(gameRole);
    }
}
