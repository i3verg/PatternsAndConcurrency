package org.train.decorator;

public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return 5+beverage.cost();
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + " , Whipped";
    }
}
