package com.example.design_pattern.abstractFactoryPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/5 15:05
 */
public interface IDepartment {

    /**
     * 插入部门
     *
     * @param department
     */
    void insert(Department department);

    /**
     * 获取部门信息
     *
     * @param num
     * @return
     */
    Department getDepartment(int num);
}
