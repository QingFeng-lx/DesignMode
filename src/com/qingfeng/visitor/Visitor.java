package com.qingfeng.visitor;

public interface Visitor {
    void visit(ConcreteElementA elementA);

    void visit(ConcreteElementB elementB);
}
