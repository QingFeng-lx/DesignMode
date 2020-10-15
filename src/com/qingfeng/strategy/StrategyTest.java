package com.qingfeng.strategy;

public class StrategyTest {
    public static void main(String[] args) {
        Context context = new Context();
        ConcreteStrategyA strategyA = new ConcreteStrategyA();
        context.setStrategy(strategyA);
        context.strategyMethod();
        System.out.println("=============================================");
        ConcreteStrategyB strategyB = new ConcreteStrategyB();
        context.setStrategy(strategyB);
        context.strategyMethod();

    }
}
