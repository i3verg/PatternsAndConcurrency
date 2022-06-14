package org.train.decorator;

public class HouseBlend extends Beverage{

    public HouseBlend() {
        desc = "House Blend";
    }

    @Override
    public int cost() {
        return 30;
    }
}
