package org.train.factory.updated;

public class NYPizzaStore extends PizzaStore {
    protected AbstractPizza createPizza(String item) {
        AbstractPizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New york Style cheese pizza");
        } else if (item.equals("meat")) {
            pizza = new MeatPizza(pizzaIngredientFactory);
            pizza.setName("New york Style meat pizza");
        }
        return pizza;
    }
}
