package com.qingfeng.state;

public class ConcreteStateA extends State{
    @Override
    public void handle(Context context) {
        System.out.println("this state is A");
        context.setState(new ConcreteStateB());
    }
}
