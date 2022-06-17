package org.train.factory.updated;

public class MeatPizza extends AbstractPizza {
    PizzaIngredientFactory pizzaIngredientFactory;
    public MeatPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
    void preparePizza(){
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
    }
}
