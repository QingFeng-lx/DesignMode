package com.qingfeng.adapter.test1;

public class ClassAdapter extends Adaptee implements Target {
    /**
     * send a request
     */
    @Override
    public void request() {
        execute();
    }
}
