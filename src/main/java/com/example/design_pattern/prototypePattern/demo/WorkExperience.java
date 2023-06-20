package com.example.design_pattern.prototypePattern.demo;

/**
 * 工作经历
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/26 15:49
 */
public class WorkExperience implements Cloneable {

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 公司地址
     */
    private String companyAddr;

    public WorkExperience(String companyName, String companyAddr) {
        this.companyName = companyName;
        this.companyAddr = companyAddr;
    }

    public WorkExperience() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "WorkExperience{" +
                "companyName='" + companyName + '\'' +
                ", companyAddr='" + companyAddr + '\'' +
                '}';
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddr() {
        return companyAddr;
    }

    public void setCompanyAddr(String companyAddr) {
        this.companyAddr = companyAddr;
    }
}
