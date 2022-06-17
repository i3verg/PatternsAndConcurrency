package org.train.factory.extended.impl.store;

import org.train.factory.extended.base.Burger;
import org.train.factory.extended.base.BurgerStore;
import org.train.factory.extended.impl.burger.KyivMeatBurger;
import org.train.factory.extended.impl.burger.KyivVegaBurger;

public class KyivBurgerStore extends BurgerStore {

    public Burger createBurger(String type) {
        Burger burger = null;
        System.out.println("adding chestnut");
        if (type.equals("meat")) {
            burger = new KyivMeatBurger();
        } else if (type.equals("vega")) {
            burger = new KyivVegaBurger();
        }
        return burger;
    }
}
