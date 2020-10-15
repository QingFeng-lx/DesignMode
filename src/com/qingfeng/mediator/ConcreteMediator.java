package com.qingfeng.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator extends Mediator {
    private List<Colleague> list = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if (!list.contains(colleague)) {
            list.add(colleague);
            colleague.setMedium(this);
        }
    }

    @Override
    public void relay(Colleague colleague) {
        for (Colleague c : list) {
            if (!c.equals(colleague)) {
                ((Colleague) c).receive();
            }
        }
    }


}
