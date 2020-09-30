package com.qingfeng.singleton;

public class MyObjectThread7 extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(MyObject7.getInstance().hashCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
