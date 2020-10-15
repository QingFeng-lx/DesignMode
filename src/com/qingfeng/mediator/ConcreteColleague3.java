package com.qingfeng.mediator;

public class ConcreteColleague3 extends Colleague{

    @Override
    public void receive() {
        System.out.println("3 receive a request!");
    }

    @Override
    public void send() {
        System.out.println("3 send a request!");
        mediator.relay(this);
    }
}
