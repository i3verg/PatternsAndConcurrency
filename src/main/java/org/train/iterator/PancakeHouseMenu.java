package org.train.iterator;

import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();
        addItem("K&B’s Pancake Breakfast", "Pancakes with scrambled eggs, and toast", 2.99, true);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", 2.99, false);
    }

    public void addItem(String name, String description, double price, boolean vegetarian) {
        MenuItem menuItem = new MenuItem(name, description, price, vegetarian);
        menuItems.add(menuItem);
    }
}
