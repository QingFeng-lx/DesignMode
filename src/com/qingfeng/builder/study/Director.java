package com.qingfeng.builder.study;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildHead();
        builder.buildEye();
        builder.buildHand();
        builder.buildFoot();
        return builder.getResult();
    }
}
