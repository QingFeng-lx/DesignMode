package com.qingfeng.decorator.practice;


public class Girl extends Changer {
    public Girl(Morrigan morrigan) {
        super(morrigan);
    }

    @Override
    public void display() {
        setChanger();
        super.display();

    }
    public void setChanger(){
        ((Original) super.morrigan).setImage("Morrigan2.jpg");
    }
}
