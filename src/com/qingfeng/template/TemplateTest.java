package com.qingfeng.template;

public class TemplateTest {
    public static void main(String[] args) {
        AbstractClass aClass = new ConcreteClass();
        aClass.TemplateMethod();
    }
}
