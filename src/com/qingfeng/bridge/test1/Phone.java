package com.qingfeng.bridge.test1;

public abstract class Phone {
    protected Color color;
    protected Memory memory;
    protected Disk disk;
    protected Size size;

    public Phone(Color color, Memory memory, Disk disk,Size size) {
        this.color = color;
        this.memory = memory;
        this.disk = disk;
        this.size=size;

    }
    public abstract void display();

}
