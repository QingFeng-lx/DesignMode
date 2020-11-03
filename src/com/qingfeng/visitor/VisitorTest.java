package com.qingfeng.visitor;

public class VisitorTest {
    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.add(new ConcreteElementA());
        structure.add(new ConcreteElementB());
        Visitor visitorA = new ConcreteVisitorA();
        structure.accept(visitorA);
        System.out.println("----------------------------------------------------");


    }
}
