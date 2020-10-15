package com.qingfeng.singleton;

public class MyObjectTest7 {
    public static void main(String[] args) {
        MyObjectThread7 thread1 = new MyObjectThread7();
        MyObjectThread7 thread2 = new MyObjectThread7();
        MyObjectThread7 thread3 = new MyObjectThread7();
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
