package com.qingfeng.prototype;

public class Square extends Shape{
    public Square(){
        type="square";
    }
    @Override
    public void draw() {
        System.out.println("draw a square");
    }
}
