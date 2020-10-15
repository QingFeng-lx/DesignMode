package com.qingfeng.singleton;

public class MyObjectTest2 {
    public static void main(String[] args) {
        MyObjectThread2 thread1 = new MyObjectThread2();
        MyObjectThread2 thread2 = new MyObjectThread2();
        MyObjectThread2 thread3 = new MyObjectThread2();
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
