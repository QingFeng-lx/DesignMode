package com.qingfeng.singleton;

import sun.security.provider.MD4;

public class MyObject4 {
    public static MyObject4 myObject;

      public static MyObject4 getInstance() {

        try {
            if (myObject != null) {
            } else {
                Thread.sleep(3000);
                synchronized (MyObject4.class) {
                    myObject = new MyObject4();
                }

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        return myObject;
    }

    private MyObject4() {
    }
}
