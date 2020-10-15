package com.qingfeng.decorator.practice;

public class Changer implements Morrigan {
    Morrigan morrigan;

    public Changer(Morrigan morrigan) {
        this.morrigan = morrigan;
    }

    /**
     * show a picture
     */
    @Override
    public void display() {
        morrigan.display();
    }
}
