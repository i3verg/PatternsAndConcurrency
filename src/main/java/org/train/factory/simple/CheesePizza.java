package org.train.factory.simple;

public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("Cheese pizza preparing");
    }
}
