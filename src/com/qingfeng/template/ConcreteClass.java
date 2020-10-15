package com.qingfeng.template;

public class ConcreteClass extends AbstractClass{
    @Override
    public void specificMethod() {
        System.out.println("i am a boy");
    }

    @Override
    public void abstractMethod1() {
        System.out.println("the method1 is used");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("the method2 is used");
    }
}
