package com.example.design_pattern.IteratorPattern.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/12 15:18
 */
public class ConcreteAggregate extends Aggregate{

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    private List<Object> list = new ArrayList<>();

    public int count(){
        return list.size();
    }

    public Object getItem(int index){
        return list.get(index);
    }
}
