package com.qingfeng.memento;

public class MementoTest {
    public static void main(String[] args) {
        Caretaker ca = new Caretaker();
        Originator or = new Originator();
        or.setState("S1");
        System.out.println("the start state:" + or.getState());
        ca.setMemento(or.createMemento());
        or.setState("S0");
        System.out.println("the new state:" + or.getState());
        or.restoreMemento(ca.getMemento());
        System.out.println("the restore state:" + or.getState());
    }
}
