package com.qingfeng.singleton;

public class MyObject7 {
    public static MyObject7 myObject = null;

    static {
        myObject = new MyObject7();
    }

    public static MyObject7 getInstance() {

        return myObject;
    }

    private MyObject7() {
    }
}
