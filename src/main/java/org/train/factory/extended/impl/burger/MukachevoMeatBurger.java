package org.train.factory.extended.impl.burger;

import org.train.factory.extended.base.Burger;

public class MukachevoMeatBurger implements Burger {
    @Override
    public void prepareBurger() {
        System.out.println("preparing Mukachevo meat burger");
    }

    @Override
    public void box() {
        System.out.println("boxing Mukachevo meat burger");
    }
}
