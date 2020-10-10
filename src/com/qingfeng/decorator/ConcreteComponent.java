package com.qingfeng.decorator;

public class ConcreteComponent implements Component{
    /**
     * the is a function
     */
    @Override
    public void operation() {
        System.out.println("create a real role");
    }
}
