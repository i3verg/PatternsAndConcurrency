package org.train.factory.extended.impl.burger;

import org.train.factory.extended.base.Burger;

public class KyivVegaBurger implements Burger {
    @Override
    public void prepareBurger() {
        System.out.println("preparing kyiv vega burger");
    }
    public void box(){
        System.out.println("Boxing vega burger");
    }
}
