package org.train.factory.updated;

import org.train.factory.updated.ingredient.Cheese;
import org.train.factory.updated.ingredient.Dough;
import org.train.factory.updated.ingredient.Sauce;
import org.train.factory.updated.ingredient.forNY.NYCheese;
import org.train.factory.updated.ingredient.forNY.NYDough;
import org.train.factory.updated.ingredient.forNY.NYSauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new NYDough();
    }

    @Override
    public Cheese createCheese() {
        return new NYCheese();
    }

    @Override
    public Sauce createSauce() {
        return new NYSauce();
    }
}
