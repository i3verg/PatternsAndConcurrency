package org.train.decorator;

public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        int cost = 7;
        if (beverage.getSize()==Size.TAll){
            cost = 10;
        } else if (beverage.getSize()==Size.GRANDE) {
            cost = 12;
        }
        return cost+ beverage.cost();
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + " , Soy";
    }
}
