package com.qingfeng.bridge.test1;

public class HuaWeiplus extends Phone{
    public HuaWeiplus(Color color, Memory memory, Disk disk, Size size) {
        super(color, memory, disk, size);
    }

    @Override
    public void display() {
        System.out.println(new Args(color.getColor(),size.getSize(),disk.getDisk(),memory.getMemory(),"HuaWeiplus"));
    }
}
