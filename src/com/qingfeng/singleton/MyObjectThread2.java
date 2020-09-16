package com.qingfeng.singleton;

public class MyObjectThread2 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println(MyObject2.getInstance().hashCode());
        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}
