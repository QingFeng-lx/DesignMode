package com.qingfeng.state;

public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public Context() {
        this.state = new ConcreteStateA();
    }

    public void handle() {
        this.state.handle(this);
    }
}
