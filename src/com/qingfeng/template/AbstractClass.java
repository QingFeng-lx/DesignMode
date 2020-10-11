package com.qingfeng.template;

public abstract class AbstractClass {
    public void TemplateMethod() {
        specificMethod();
        abstractMethod1();
        abstractMethod2();
    }

    public void specificMethod() {
        System.out.println("the real method is used");
    }

    public abstract void abstractMethod1();

    public abstract void abstractMethod2();

}
