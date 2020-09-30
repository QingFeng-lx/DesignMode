package com.qingfeng.builder;

public class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA("set A");

    }

    @Override
    public void buildPartB() {
        product.setPartB("set B");
    }

    @Override
    public void buildPartC() {
        product.setPartC("set C");
    }
}
