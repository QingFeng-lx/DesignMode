package com.qingfeng.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate {
    private List<Object> list = new ArrayList<>();

    @Override
    public void add(Object o) {
        list.add(o);
    }

    @Override
    public void remove(Object o) {
        list.remove(o);
    }

    @Override
    public Iterator getIterator() {
        return (new ConcreteIterator(list));
    }
}
