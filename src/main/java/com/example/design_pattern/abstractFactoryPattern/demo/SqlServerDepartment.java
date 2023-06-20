package com.example.design_pattern.abstractFactoryPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/5 15:10
 */
public class SqlServerDepartment implements IDepartment {

    @Override
    public void insert(Department department) {
        System.out.println("sqlServer 插入部门");
    }

    @Override
    public Department getDepartment(int num) {
        System.out.println("sqlServer 获取部门信息" + num);
        return null;
    }
}
