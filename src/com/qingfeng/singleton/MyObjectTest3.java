package com.qingfeng.singleton;

public class MyObjectTest3 {
    public static void main(String[] args) {
        MyObjectThread3 thread1 = new MyObjectThread3();
        MyObjectThread3 thread2 = new MyObjectThread3();
        MyObjectThread3 thread3 = new MyObjectThread3();
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
