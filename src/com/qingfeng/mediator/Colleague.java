package com.qingfeng.mediator;

public abstract class Colleague {
    protected Mediator mediator;

    public void setMedium(Mediator medium) {
        this.mediator = medium;
    }

    public abstract void receive();

    public abstract void send();
}
