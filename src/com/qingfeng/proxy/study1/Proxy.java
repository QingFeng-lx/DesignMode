package com.qingfeng.proxy.study1;

public class Proxy implements Subject {
    private RealSubject realSubject = new RealSubject();

    @Override
    public void play() {
        System.out.println("start...");
        realSubject.play();
        System.out.println("end...");
    }
}
