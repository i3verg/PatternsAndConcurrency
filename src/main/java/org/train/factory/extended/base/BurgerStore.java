package org.train.factory.extended.base;


public abstract class BurgerStore {

    public Burger orderBurger(String type){
        Burger burger;
        burger = createBurger(type);
        burger.prepareBurger();
        burger.box();
        return burger;
    }

    protected abstract Burger createBurger(String type);
}
