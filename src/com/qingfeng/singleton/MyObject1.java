package com.qingfeng.singleton;

public class MyObject1 {
    public static MyObject1 myObject1 =new MyObject1();
    public static MyObject1 getInstance(){
        return myObject1;
    }
    private MyObject1() {
    }
}
