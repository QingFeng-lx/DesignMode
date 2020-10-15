package com.qingfeng.singleton;

public class MyObject2 {
    public static MyObject2 myObject;

    synchronized public static MyObject2 getInstance() {
        try {
            if (myObject != null) {
            } else {
                Thread.sleep(3000);
                myObject = new MyObject2();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        return myObject;
    }

    private MyObject2() {
    }
}
