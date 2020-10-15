package com.qingfeng.builder.study;

public class ConcreateBuilder extends Builder{
    @Override
    public void buildHead() {
        product.setHead("make a head");
    }

    @Override
    public void buildEye() {
        product.setEye("make an eyes");
    }

    @Override
    public void buildHand() {
        product.setHand("make a hands");
    }

    @Override
    public void buildFoot() {
        product.setFoot("make a foot");
    }
}
