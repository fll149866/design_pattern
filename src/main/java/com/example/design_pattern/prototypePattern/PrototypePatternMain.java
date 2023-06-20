package com.example.design_pattern.prototypePattern;

import com.example.design_pattern.prototypePattern.demo.NewResume;
import com.example.design_pattern.prototypePattern.demo.NewResumeCopy;
import com.example.design_pattern.prototypePattern.demo.NewResumeDeep;
import com.example.design_pattern.prototypePattern.demo.Resume;
import org.junit.jupiter.api.Test;

/**
 * 原型模式
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/26 14:42
 */
public class PrototypePatternMain {

    public static void main(String[] args) {
        Resume resume1 = new Resume("大红1");
        Resume resume2 = new Resume("大红2");
        Resume resume3 = new Resume("大红3");
    }

    /**
     * 原型模式测试
     */
    @Test
    public void testPrototype() throws Exception {
        NewResume resume = new NewResume("冯哈哈");
        resume.setPersonalInfo(21, 1);
        resume.setWorkExperience("北京", "冯的公司");

        NewResume resume1 = (NewResume) resume.clone();
        NewResume resume2 = (NewResume) resume.clone();
        resume1.setPersonalInfo(22, 1);
        resume2.setWorkExperience("北京", "冯哈哈公司");


        System.out.println(resume);
        System.out.println(resume1);
        System.out.println(resume2);

    }

    /**
     * 测试深拷贝原型模式
     */
    @Test
    public void testDeepPrototype() throws CloneNotSupportedException {

        // 浅拷贝
        NewResumeCopy resumeCopy = new NewResumeCopy("冯太大");
        resumeCopy.setPersonalInfo(20, 1);
        resumeCopy.setWorkExperience("大连", "冯公司");

        NewResumeCopy resumeCopy1 = (NewResumeCopy) resumeCopy.clone();
        resumeCopy1.setWorkExperience("大美", "ha公司");
        System.out.println(resumeCopy);
        System.out.println(resumeCopy1);

        // 深拷贝
        NewResumeDeep resumeDeep = new NewResumeDeep("冯大大");
        resumeDeep.setPersonalInfo(18, 1);
        resumeDeep.setWorkExperience("大连海湾", "风大集团");

        NewResumeDeep resumeDeep1 = (NewResumeDeep) resumeDeep.clone();
        NewResumeDeep resumeDeep2 = (NewResumeDeep) resumeDeep.clone();
        resumeDeep1.setWorkExperience("大北港口", "冯集团");
        resumeDeep2.setPersonalInfo(19, 1);

        System.out.println(resumeDeep);
        System.out.println(resumeDeep1);
        System.out.println(resumeDeep2);
    }
}
