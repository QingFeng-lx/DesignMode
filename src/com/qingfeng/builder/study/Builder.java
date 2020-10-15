package com.qingfeng.builder.study;

public abstract class Builder {
    protected Product product=new Product();
    public abstract void buildHead();
    public abstract void buildEye();
    public abstract void buildHand();
    public abstract void buildFoot();
    public Product getResult(){
        return product;
    }
}
