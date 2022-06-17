package org.train.factory.extended;

import org.train.factory.extended.base.Burger;
import org.train.factory.extended.base.BurgerStore;
import org.train.factory.extended.impl.store.KyivBurgerStore;
import org.train.factory.extended.impl.store.MukachevoBurgerStore;

public class BurgerStoreTest {
    public static void main(String[] args) {
        BurgerStore mukachevoBurgerStore = new MukachevoBurgerStore();
        BurgerStore kyivBurgerStore = new KyivBurgerStore();
        Burger burger = mukachevoBurgerStore.orderBurger("vega");
        burger = kyivBurgerStore.orderBurger("meat");



    }

}
