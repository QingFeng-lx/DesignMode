package com.qingfeng.singleton;

public class MyObject3 {
    public static MyObject3 myObject;

    synchronized public static MyObject3 getInstance() {
        synchronized (MyObject3.class) {
            try {
                if (myObject != null) {
                } else {
                    Thread.sleep(3000);
                    myObject = new MyObject3();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return myObject;
    }

    private MyObject3() {
    }
}
