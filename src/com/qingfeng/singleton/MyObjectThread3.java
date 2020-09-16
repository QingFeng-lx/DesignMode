package com.qingfeng.singleton;

public class MyObjectThread3 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println(MyObject3.getInstance().hashCode());
        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}
