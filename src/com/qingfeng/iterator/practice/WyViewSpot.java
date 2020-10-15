package com.qingfeng.iterator.practice;

public class WyViewSpot {
    private String name;
    private String introduce;

    public WyViewSpot(String name, String introduce) {
        this.name = name;
        this.introduce = introduce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    @Override
    public String toString() {
        return "WyViewSpot{" +
                "name='" + name + '\'' +
                ", introduce='" + introduce + '\'' +
                '}';
    }
}
