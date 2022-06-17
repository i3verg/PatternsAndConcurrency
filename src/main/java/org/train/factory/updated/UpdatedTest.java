package org.train.factory.updated;

public class UpdatedTest {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("cheese");
        AbstractPizza pizza = pizzaStore.createPizza("cheese");

        pizza.preparePizza();
        pizza.bake();
        pizza.box();
    }
}
