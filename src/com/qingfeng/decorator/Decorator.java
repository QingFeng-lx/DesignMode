package com.qingfeng.decorator;

public class Decorator implements Component{
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    /**
     * the is a function
     */
    @Override
    public void operation() {
        component.operation();
    }
}
