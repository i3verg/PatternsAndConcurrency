package org.train.factory.updated;

import org.train.factory.updated.ingredient.Cheese;
import org.train.factory.updated.ingredient.Dough;
import org.train.factory.updated.ingredient.Sauce;

public abstract class AbstractPizza {
    String name;
    Cheese cheese;
    Dough dough;
    Sauce sauce;

    abstract void preparePizza();

    void bake(){
        System.out.println("Bake for 20 minutes at 350");
    }

    void box(){
        System.out.println("Boxing pizza");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AbstractPizza{" +
                "name='" + name + '\'' +
                '}';
    }
}
