package com.qingfeng.Observer;

public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        ConcreteObserver1 observer1 = new ConcreteObserver1();
        ConcreteObserver2 observer2= new ConcreteObserver2();
        subject.add(observer1);
        subject.add(observer2);
        subject.notifyObserver();
    }
}
