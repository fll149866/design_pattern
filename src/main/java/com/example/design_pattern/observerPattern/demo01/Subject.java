package com.example.design_pattern.observerPattern.demo01;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 主题
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/5/29 18:34
 */
public class Subject {

    /**
     * 观察者列表
     */
    private List<Observer> observerList = new ArrayList<>();

    /**
     * 通知观察者采取什么行动
     */
    private String action;

    /**
     * 添加观察者
     */
    public void addObservers(Observer observer) {
        this.observerList.add(observer);
    }

    /**
     * 删除观察者
     *
     * @param observer
     */
    public void delObservers(Observer observer) {
        this.observerList.remove(observer);
    }


    /**
     * 通知观察者
     */
    public void notifyObservers() {
        observerList.forEach(Observer::updateState);
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public List<Observer> getObserverList() {
        return observerList;
    }

    public void setObserverList(List<Observer> observerList) {
        this.observerList = observerList;
    }
}
