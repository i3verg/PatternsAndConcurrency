package org.train.factory.extended.impl.store;

import org.train.factory.extended.base.Burger;
import org.train.factory.extended.base.BurgerStore;
import org.train.factory.extended.impl.burger.MukachevoMeatBurger;
import org.train.factory.extended.impl.burger.MukachevoVegaBurger;

public class MukachevoBurgerStore extends BurgerStore {

    public Burger createBurger(String type) {
        Burger burger = null;
        System.out.println("adding sigidinsky");
        if (type.equals("meat")) {
            burger = new MukachevoMeatBurger();
        } else if (type.equals("vega")) {
            burger = new MukachevoVegaBurger();
        }
        return burger;
    }
}
