package com.example.design_pattern.flyweightPattern;

import com.example.design_pattern.flyweightPattern.demo.User;
import com.example.design_pattern.flyweightPattern.demo.WebSite;
import com.example.design_pattern.flyweightPattern.demo.WebSiteFactory;

/**
 * 享元模式
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/19 13:22
 */
public class FlyweightPatternMain {

    public static void main(String[] args) {
        // 构建享元工厂对象
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite siteCategory = webSiteFactory.getWebSiteCategory("博客");
        siteCategory.use(new User("大力"));

        WebSite siteCategory1 = webSiteFactory.getWebSiteCategory("博客");
        siteCategory1.use(new User("芳华"));

        WebSite siteCategory2 = webSiteFactory.getWebSiteCategory("产品展示");
        WebSite siteCategory3 = webSiteFactory.getWebSiteCategory("产品展示");
        siteCategory2.use(new User("风华"));
        siteCategory3.use(new User("邯郸"));

        System.out.println(webSiteFactory.getCount());


    }
}
