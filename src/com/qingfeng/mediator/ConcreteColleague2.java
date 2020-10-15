package com.qingfeng.mediator;

public class ConcreteColleague2 extends Colleague{

    @Override
    public void receive() {
        System.out.println("2 receive a request!");
    }

    @Override
    public void send() {
        System.out.println("2 send a request!");
        mediator.relay(this);
    }
}
