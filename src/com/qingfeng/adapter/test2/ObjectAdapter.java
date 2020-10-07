package com.qingfeng.adapter.test2;

public class ObjectAdapter implements Target{
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * It is a interface of needing to change
     */
    @Override
    public void request() {
        adaptee.execute();
    }
}
