package com.example.design_pattern.chainOfResPattern.demo;

/**
 * 管理者
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/16 15:04
 */
public abstract class Manager {

    /**
     * 管理者名称
     */
    protected String name;

    /**
     * 上级
     */
    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    /**
     * 设置上级
     *
     * @param superior 上级
     */
    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    /**
     * 处理请求
     *
     * @param request 请求
     */
    public abstract void requestApplication(Request request);

}
