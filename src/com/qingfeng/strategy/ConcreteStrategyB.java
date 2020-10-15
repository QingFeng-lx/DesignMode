package com.qingfeng.strategy;

public class ConcreteStrategyB implements Strategy{
    @Override
    public void strategyMethod() {
        System.out.println("the strategy for B is visited");
    }
}
