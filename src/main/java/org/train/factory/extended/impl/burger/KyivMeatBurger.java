package org.train.factory.extended.impl.burger;

import org.train.factory.extended.base.Burger;

public class KyivMeatBurger implements Burger {
    @Override
    public void prepareBurger() {
        System.out.println("preparing kyiv meat burger");
    }
    public void box(){
        System.out.println("Boxing meat burger");
    }
}
