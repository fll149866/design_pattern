package com.example.design_pattern.prototypePattern.demo;


/**
 * 使用原型模式
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/26 15:07
 */
public class NewResume implements Cloneable{

    private String name;

    private Integer age;

    private Integer sex;

    private String company;

    private String companyArea;

    public NewResume(String name) {
        this.name = name;
    }

    /**
     * 设置个人信息
     *
     * @param age
     * @param sex
     */
    public void setPersonalInfo(Integer age, Integer sex) {
        this.age = age;
        this.sex = sex;
    }

    /**
     * 设置工作经历
     *
     * @param companyArea
     * @param company
     */
    public void setWorkExperience(String companyArea, String company) {
        this.companyArea = companyArea;
        this.company = company;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "NewResume{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", company='" + company + '\'' +
                ", companyArea='" + companyArea + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompanyArea() {
        return companyArea;
    }

    public void setCompanyArea(String companyArea) {
        this.companyArea = companyArea;
    }
}
