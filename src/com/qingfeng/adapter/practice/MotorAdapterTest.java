package com.qingfeng.adapter.practice;

public class MotorAdapterTest {
    public static void main(String[] args) {
          Motor motor= (Motor) ReadXML.getObject();
          motor.drive();
    }
}
