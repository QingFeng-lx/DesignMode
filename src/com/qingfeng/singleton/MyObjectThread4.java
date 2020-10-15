package com.qingfeng.singleton;

public class MyObjectThread4 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println(MyObject4.getInstance().hashCode());
        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}
