package org.train.factory.extended.impl.burger;

import org.train.factory.extended.base.Burger;

public class MukachevoVegaBurger implements Burger {
    @Override
    public void prepareBurger() {
        System.out.println("preparing Mukachevo vega burger");

    }

    @Override
    public void box() {
        System.out.println("boxing Mukachevo vega burger");

    }
}
