package com.qingfeng.singleton;

public class MyObjectThread5 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println(MyObject5.getInstance().hashCode());
        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}
