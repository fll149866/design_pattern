package com.example.design_pattern.flyweightPattern.demo;

import java.util.HashMap;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/19 13:27
 */
public class WebSiteFactory {

    /**
     * 构建的享元对象
     */
    private HashMap<String, WebSite> flyweights = new HashMap<>();

    /**
     * 获取享元对象
     *
     * @param key
     * @return
     */
    public WebSite getWebSiteCategory(String key) {
        // 不含有该享元对象
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteWebSite(key));
        }
        return flyweights.get(key);
    }

    /**
     * 获取享元对象数量
     *
     * @return
     */
    public int getCount() {
        return flyweights.size();
    }
}
