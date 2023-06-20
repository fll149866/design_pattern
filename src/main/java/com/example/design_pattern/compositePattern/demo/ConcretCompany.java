package com.example.design_pattern.compositePattern.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/12 11:06
 */
public class ConcretCompany extends Company {

    private List<Company> companies = new ArrayList<>();

    public ConcretCompany(String name) {
        super(name);
    }

    /**
     * 添加公司
     *
     * @param company
     */
    @Override
    public void add(Company company) {
        companies.add(company);
    }

    /**
     * 删除公司
     *
     * @param company
     */
    @Override
    public void remove(Company company) {
        companies.remove(company);
    }

    @Override
    public void display(int depth) {
        System.out.println("-".repeat(depth) + name);
        for (Company c :
                companies) {
            c.display(depth+2);
        }
    }

    @Override
    public void duty() {
        for (Company c :
                companies) {
            c.duty();
        }
    }
}
