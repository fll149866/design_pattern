package com.example.design_pattern.abstractFactoryPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/5 15:08
 */
public class AccessDepartment implements IDepartment {

    @Override
    public void insert(Department department) {
        System.out.println("新增一条部门信息");
    }

    @Override
    public Department getDepartment(int num) {
        System.out.println("获取部门信息"+num);
        return null;
    }
}
