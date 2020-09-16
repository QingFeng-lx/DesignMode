package com.qingfeng.singleton;



public class MyObject6 {
    private static class MyObjectHandler {
        private static MyObject6 myObject = new MyObject6();
    }


    public static MyObject6 getInstance() {
        return MyObjectHandler.myObject;
    }

    private MyObject6() {
    }
}
