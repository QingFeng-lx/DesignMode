package com.qingfeng.visitor;

public interface Element {
    void accept(Visitor visitor);
}
