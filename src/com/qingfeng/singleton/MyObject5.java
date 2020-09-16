package com.qingfeng.singleton;

public class MyObject5 {
    public static MyObject5 myObject;

    public static MyObject5 getInstance() {

        try {
            if (myObject != null) {
            } else {
                Thread.sleep(3000);
                synchronized (MyObject5.class) {
                    if (myObject == null) {
                        myObject = new MyObject5();
                    }

                }

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        return myObject;
    }

    private MyObject5() {
    }
}
