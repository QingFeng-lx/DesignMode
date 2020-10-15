package com.qingfeng.proxy.study1;

public class RealSubject implements Subject{
    @Override
    public void play() {
        System.out.println("buy a box!");
    }
}
