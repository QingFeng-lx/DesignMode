package com.qingfeng.Observer.paractice2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BellEventSource {
    protected List<BellEventListener>bellEventListeners;
    public BellEventSource(){
        bellEventListeners=new ArrayList<>();
    }
    public void addPersonListener(BellEventListener bellEventListener){
        bellEventListeners.add(bellEventListener);
    }
    public void ring(boolean sound){
        String type=sound?"上课铃":"下课铃";
        System.out.println(type+"响！");
        RingEvent event=new RingEvent(this, sound);
        notifies(event);    //通知注册在该事件源上的所有监听器
    }

    public void notifies(RingEvent e ) {
        BellEventListener ren=null;
        Iterator<BellEventListener> iterator=bellEventListeners.iterator();
        while(iterator.hasNext())
        {
            ren=iterator.next();
            ren.heardBell(e);
        }
    }
}
