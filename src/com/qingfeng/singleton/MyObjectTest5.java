package com.qingfeng.singleton;

/**
 * it is can
 */
public class MyObjectTest5 {
    public static void main(String[] args) {
        MyObjectThread5 thread1 = new MyObjectThread5();
        MyObjectThread5 thread2 = new MyObjectThread5();
        MyObjectThread5 thread3 = new MyObjectThread5();
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
