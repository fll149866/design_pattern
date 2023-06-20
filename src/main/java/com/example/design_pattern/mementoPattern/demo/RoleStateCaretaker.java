package com.example.design_pattern.mementoPattern.demo;

/**
 * 角色状态管理
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/12 9:59
 */
public class RoleStateCaretaker {

    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
