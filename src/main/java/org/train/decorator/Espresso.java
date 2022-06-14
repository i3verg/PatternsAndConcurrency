package org.train.decorator;

public class Espresso extends Beverage{

    public Espresso() {
        desc = "Espresso";
    }

    @Override
    public int cost() {
        return 25;
    }
}
