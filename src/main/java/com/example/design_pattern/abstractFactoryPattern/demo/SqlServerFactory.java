package com.example.design_pattern.abstractFactoryPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/1 16:25
 */
public class SqlServerFactory implements IFactory {

    /**
     * 返回sqlServer持久层对象
     *
     * @return
     */
    @Override
    public IUser createUser() {
        return new SqlServerUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlServerDepartment();
    }
}
