package com.qingfeng.Observer;

public class ConcreteObserver1 implements Observer{
    /**
     * do a function of update
     */
    @Override
    public void response() {
        System.out.println("The concrete target of one is changed!");
    }
}
