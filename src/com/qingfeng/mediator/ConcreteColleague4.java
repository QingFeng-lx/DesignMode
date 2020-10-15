package com.qingfeng.mediator;

public class ConcreteColleague4 extends Colleague{

    @Override
    public void receive() {
        System.out.println("4 receive a request!");
    }

    @Override
    public void send() {
        System.out.println("4 send a request!");
        mediator.relay(this);
    }
}
