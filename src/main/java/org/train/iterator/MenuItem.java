package org.train.iterator;

public class MenuItem {
    String name;
    String desc;
    double price;
    boolean vegetarian;

    public MenuItem(String name, String desc, double price, boolean vegan) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.vegetarian = vegan;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian(){
        return vegetarian;
    }
}
