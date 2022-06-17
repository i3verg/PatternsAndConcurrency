package org.train.factory.updated;

import org.train.factory.updated.AbstractPizza;

public abstract class PizzaStore {

    public AbstractPizza orderPizza(String type){
        AbstractPizza pizza;
        pizza = createPizza(type);
        return pizza;
    }

    protected abstract AbstractPizza createPizza(String type);

}
