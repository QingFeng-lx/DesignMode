package com.qingfeng.bridge.test1;



public class PhoneTest {
    public static void main(String[] args) {
        HuaWeiplus huaWeiplus = new HuaWeiplus(new RedColor(),new Memory_6G(),new Disk_64G(),new NormalSize());
        huaWeiplus.display();

    }
}
