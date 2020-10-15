package com.qingfeng.iterator.practice;

public interface ViewSpotSet {
    void add(WyViewSpot obj);
    void remove(WyViewSpot obj);
    ViewSpotIterator getIterator();
}
