package com.qingfeng.bridge;

public class BridgeTest {
    public static void main(String[] args) {
        Implementor ImplementorA = new ConcreateImplementorA();
        Abstraction abstraction = new RefinedAbstraction(ImplementorA);
        abstraction.operation();
    }
}
