package com.example.design_pattern.abstractFactoryPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/1 16:23
 */
public class SqlServerUser implements IUser {

    @Override
    public void insert(User user) {
        System.out.println("插入角色。。。成功");
    }

    @Override
    public User getUser(int id) {
        System.out.println("返回角色成功。。。");
        return null;
    }
}
