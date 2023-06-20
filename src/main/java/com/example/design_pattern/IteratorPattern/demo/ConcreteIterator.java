package com.example.design_pattern.IteratorPattern.demo;

/**
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/12 15:18
 */
public class ConcreteIterator extends Iterator {

    private ConcreteAggregate concreteAggregate;

    /**
     * 索引
     */
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
    }

    @Override
    public Object first() {
        return concreteAggregate.getItem(0);
    }

    @Override
    public Object next() {
        current++;
        if (current < concreteAggregate.count()) {
            return concreteAggregate.getItem(current);
        }
        return null;
    }

    @Override
    public boolean isDone() {
        return current >= concreteAggregate.count();
    }

    @Override
    public Object currentItem() {
        return concreteAggregate.getItem(current);
    }
}
