package com.qingfeng.iterator;

public interface Aggregate {
    public void add(Object o);
    public void remove(Object o);
    public Iterator getIterator();
}
