package com.qingfeng.mediator;

public class MediatorTest {
    public static void main(String[] args) {
        Colleague colleague1 = new ConcreteColleague1();
        Colleague colleague2 = new ConcreteColleague2();
        Colleague colleague3 = new ConcreteColleague3();
        Colleague colleague4 = new ConcreteColleague4();

        Mediator mediator = new ConcreteMediator();
        mediator.register(colleague1);
        mediator.register(colleague2);
        mediator.register(colleague3);
        mediator.register(colleague4);

        colleague1.send();
        System.out.println("============================================");
        colleague2.send();
    }
}
