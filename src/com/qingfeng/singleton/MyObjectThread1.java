package com.qingfeng.singleton;

public class MyObjectThread1 extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject1.getInstance().hashCode());
    }
}
