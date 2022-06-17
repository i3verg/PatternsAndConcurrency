package org.train.factory.simple;

import org.train.factory.updated.MeatPizza;

public class SimplePizzaFactory {


    public Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equals("meat")){
           // pizza = new MeatPizza();
        } else if (type.equals("pepperoni")){
            pizza = new PepePizza();
        } else if (type.equals("cheese")){
            pizza = new CheesePizza();
        }
        return pizza;
    }
}
