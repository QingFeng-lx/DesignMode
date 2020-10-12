package com.qingfeng.iterator;

public class AggregateTest {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("liuxin");
        aggregate.add("liuxi");
        aggregate.add("lixiaolong");
        Iterator iterator = aggregate.getIterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
        System.out.println("----------------------------------------");
        System.out.println(iterator.first());
    }
}
