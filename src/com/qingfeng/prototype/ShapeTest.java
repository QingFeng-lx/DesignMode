package com.qingfeng.prototype;

public class ShapeTest  {
    public static void main(String[] args)   {
        ShapeCache.loadCache();
        try {
            Shape shape = ShapeCache.getShape("1");
            shape.draw();
            Shape shape1 = ShapeCache.getShape("2");
            shape1.draw();
            Shape shape2 = ShapeCache.getShape("3");
            shape2.draw();


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
