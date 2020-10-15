package com.qingfeng.singleton;

public class MyObjectTest4 {
    public static void main(String[] args) {
        MyObjectThread4 thread1 = new MyObjectThread4();
        MyObjectThread4 thread2 = new MyObjectThread4();
        MyObjectThread4 thread3 = new MyObjectThread4();
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
