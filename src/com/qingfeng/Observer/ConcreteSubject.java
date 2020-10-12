package com.qingfeng.Observer;

public class ConcreteSubject extends Subject{

    @Override
    public void notifyObserver() {
        System.out.println("The concreted target is changed!");
        System.out.println("----------------------------------------------");
        for (Object o:observers){
            ((Observer)o).response();
        }

    }
}
