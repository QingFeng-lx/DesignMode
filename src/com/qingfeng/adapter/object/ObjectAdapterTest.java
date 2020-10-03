package com.qingfeng.adapter.object;

public class ObjectAdapterTest {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();

    }
}
