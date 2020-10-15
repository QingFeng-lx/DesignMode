package com.qingfeng.strategy;

public class ConcreteStrategyA implements Strategy{
    @Override
    public void strategyMethod() {
        System.out.println("the strategy for A is visited");
    }
}
