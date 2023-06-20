package com.example.design_pattern.prototypePattern.demo;

/**
 * 简历类
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/26 14:43
 */
public class Resume {

    /**
     * 名称
     */
    private String name;


    /**
     * 性别 1 男 0 女
     */
    private Integer sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 名称必须有
     *
     * @param name
     */
    public Resume(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
