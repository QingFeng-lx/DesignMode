package com.qingfeng.decorator;

public class ConcreteDecorator1 extends Decorator{
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addFunction();
    }
    public void addFunction(){
        System.out.println("add a new function!");
    }
}
