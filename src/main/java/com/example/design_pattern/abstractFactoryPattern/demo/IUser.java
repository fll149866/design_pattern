package com.example.design_pattern.abstractFactoryPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/1 16:21
 */
public interface IUser {

    /**
     * 插入角色
     *
     * @param user
     */
    void insert(User user);

    /**
     * 根据id获取角色
     *
     * @param id
     * @return
     */
    User getUser(int id);
}
