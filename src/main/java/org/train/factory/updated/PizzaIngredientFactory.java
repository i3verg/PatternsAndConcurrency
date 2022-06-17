package org.train.factory.updated;

import org.train.factory.updated.ingredient.Cheese;
import org.train.factory.updated.ingredient.Dough;
import org.train.factory.updated.ingredient.Sauce;

public interface PizzaIngredientFactory {
    Dough createDough();
    Cheese createCheese();
    Sauce createSauce();
}
