package com.qingfeng.state;

public class ConcreteStateB extends State{
    @Override
    public void handle(Context context) {
        System.out.println("this state is B");
        context.setState(new ConcreteStateA());

    }
}
