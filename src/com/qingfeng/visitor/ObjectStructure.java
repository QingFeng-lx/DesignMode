package com.qingfeng.visitor;

import java.util.Iterator;
import java.util.LinkedList;

public class ObjectStructure {
    private LinkedList<Element> list;

    public ObjectStructure() {
        this.list = new LinkedList<>();
    }

    public void accept(Visitor visitor) {
        Iterator<Element> iterator = list.iterator();
         while(iterator.hasNext()){
             ((Element)iterator.next()).accept(visitor);
         }
    }

    public void add(Element element) {
        list.add(element);
    }

    public void remove(Element element) {
        list.add(element);
    }
}
