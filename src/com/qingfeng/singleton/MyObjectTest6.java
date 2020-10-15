package com.qingfeng.singleton;

public class MyObjectTest6 {
    public static void main(String[] args) {
        MyObjectThread6 thread1 = new MyObjectThread6();
        MyObjectThread6 thread2 = new MyObjectThread6();
        MyObjectThread6 thread3 = new MyObjectThread6();
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
