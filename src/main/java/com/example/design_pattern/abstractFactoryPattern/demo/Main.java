package com.example.design_pattern.abstractFactoryPattern.demo;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/1 16:27
 */
public class Main {

    public static void main(String[] args) {
        SqlServerFactory sqlServerFactory = new SqlServerFactory();
        IUser user = sqlServerFactory.createUser();
        user.insert(new User());
        user.getUser(1);


        AccessFactory accessFactory = new AccessFactory();
        IUser accessFactoryUser = accessFactory.createUser();
        accessFactoryUser.getUser(1);
        accessFactoryUser.insert(new User());

        IDepartment department = sqlServerFactory.createDepartment();
        department.getDepartment(1);
        department.insert(null);

        IDepartment accessFactoryDepartment = accessFactory.createDepartment();
        accessFactoryDepartment.insert(null);
        accessFactoryDepartment.getDepartment(2);
    }

    /**
     * 测试优化的抽象工厂模式
     */
    @Test
    public void testModify() {
        DataAccess<IUser> userDataAccess = new DataAccess<>();
        userDataAccess.driverName = "com.example.design_pattern.abstractFactoryPattern.demo.SqlServerUser";
        IUser userDataAccessAccess = userDataAccess.createAccess();
//        System.out.println(userClass.getName());
        try {
            userDataAccessAccess.getUser(1);
            DataAccess<IDepartment> departmentDataAccess = new DataAccess<>();
            departmentDataAccess.driverName = "com.example.design_pattern.abstractFactoryPattern.demo.SqlServerDepartment";
            IDepartment departmentDataAccessAccess = departmentDataAccess.createAccess();
            departmentDataAccessAccess.getDepartment(1);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
