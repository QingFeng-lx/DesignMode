package com.qingfeng.iterator;

import java.util.List;

public class ConcreteIterator implements Iterator {
    private List<Object> list = null;
    private int index = -1;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object first() {
        return list.get(0);
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return list.get(++index);
        } else {
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        if (index < list.size() - 1) {
            return true;
        } else {
            return false;
        }

    }
}
