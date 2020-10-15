package com.qingfeng.Observer.practice;

public class RateTest {
    public static void main(String[] args) {
        Rate rate = new RMBrate();
        Company importCompany = new ImportCompany();
        Company exportCompany = new ExportCompany();
        rate.add(importCompany);
        rate.add(exportCompany);
        rate.changed(10);
        rate.changed(-20);
    }
}
