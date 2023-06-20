package com.example.design_pattern.prototypePattern.demo;


/**
 * 使用原型模式，深拷贝
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/26 15:07
 */
public class NewResumeCopy implements Cloneable {

    private String name;

    private Integer age;

    private Integer sex;

    /**
     * 工作经历
     */
    private WorkExperience workExperience;

    public NewResumeCopy(String name) {
        this.name = name;
        this.workExperience = new WorkExperience();
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
     * @param company
     */
    public void setWorkExperience(String companyAddr, String company) {
        this.workExperience.setCompanyAddr(companyAddr);
        this.workExperience.setCompanyName(company);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "NewResumeDeep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", workExperience=" + workExperience +
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

}
