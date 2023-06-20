package com.example.design_pattern.compositePattern;

import com.example.design_pattern.compositePattern.demo.ConcretCompany;
import com.example.design_pattern.compositePattern.demo.Department;

/**
 * 组合模式
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/12 10:57
 */
public class CompositePatternMain {

    public static void main(String[] args) {
        // 根公司
        ConcretCompany root = new ConcretCompany("北京总公司");

        // 添加部门
        root.add(new Department("财务部"));
        root.add(new Department("人事部门"));

        // 添加分公司
        ConcretCompany company1 = new ConcretCompany("上海分公司");
        company1.add(new Department("分公司的部门1"));
        root.add(company1);

        System.out.println("总分公司图纸");
        root.display(1);

        root.duty();

    }
}
