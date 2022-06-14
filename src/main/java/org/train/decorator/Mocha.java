package org.train.decorator;

public class Mocha extends CondimentDecorator{

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return 10 + beverage.cost();
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ",Mocha";
    }
}
