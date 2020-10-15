package com.qingfeng.iterator.practice;

public interface ViewSpotIterator {
    public boolean hasNext();
    public WyViewSpot first();
    public WyViewSpot next();
    public WyViewSpot previous();
    public WyViewSpot last();
}
