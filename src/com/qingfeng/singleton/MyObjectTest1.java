package com.qingfeng.singleton;

public class MyObjectTest1 {
    public static void main(String[] args) {
        MyObjectThread1 thread1 = new MyObjectThread1();
        MyObjectThread1 thread2 = new MyObjectThread1();
        MyObjectThread1 thread3 = new MyObjectThread1();
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
