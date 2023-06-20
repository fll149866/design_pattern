package com.example.design_pattern.abstractFactoryPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/1 16:21
 */
public interface IFactory {

    /**
     * 创建User类的持久层访问对象
     *
     * @return
     */
    IUser createUser();

    /**
     * 创建部门类访问对象
     *
     * @return
     */
    IDepartment createDepartment();
}
