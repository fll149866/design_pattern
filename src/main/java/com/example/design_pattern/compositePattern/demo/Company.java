package com.example.design_pattern.compositePattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/12 10:58
 */
public abstract class Company {

    /**
     * 名称
     */
    public String name;

    public Company(String name) {
        this.name = name;
    }

    /**
     * 添加公司/部门
     */
    public abstract void add(Company company);

    /**
     * 删除公司/部门
     */
    public abstract void remove(Company company);

    /**
     * 展示
     *
     * @param depth
     */
    public abstract void display(int depth);

    /**
     * 责任
     */
    public abstract void duty();

}
