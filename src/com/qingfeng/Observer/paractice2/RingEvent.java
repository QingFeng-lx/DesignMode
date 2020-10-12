package com.qingfeng.Observer.paractice2;

import java.util.EventObject;

public class RingEvent extends EventObject {
    private Boolean sound;

    public RingEvent(Object source, Boolean sound) {
        super(source);
        this.sound = sound;
    }

    public void setSound(boolean sound) {
        this.sound = sound;
    }

    public boolean getSound() {
        return this.sound;
    }
}
