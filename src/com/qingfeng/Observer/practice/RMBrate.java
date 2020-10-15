package com.qingfeng.Observer.practice;

public class RMBrate extends Rate {
    @Override
    public void changed(int number) {
        System.out.println();
        for (Object o : companies) {
            ((Company) o).response(number);
        }
    }
}
