package com.qingfeng.Observer.paractice2;

import java.util.EventListener;

public interface BellEventListener extends EventListener {
    public void heardBell(RingEvent e);
}
