package com.qingfeng.adapter.test2;

public class ObjectAdapterTest {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target adapter = new ObjectAdapter(adaptee);
        adapter.request();

    }
}
