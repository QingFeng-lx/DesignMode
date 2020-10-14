package com.qingfeng.mediator;

public class ConcreteColleague1 extends Colleague {

    @Override
    public void receive() {
        System.out.println("1 receive a request!");
    }

    @Override
    public void send() {
        System.out.println("1 send a request!");
        mediator.relay(this);
    }
}
