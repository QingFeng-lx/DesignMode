package com.qingfeng.singleton;

public class MyObjectThread6 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println(MyObject6.getInstance().hashCode());
        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}
