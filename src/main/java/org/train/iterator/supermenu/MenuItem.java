package org.train.iterator.supermenu;

public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vega;
    double price;

    public MenuItem(String name, String description, boolean vega, double price) {
        this.name = name;
        this.description = description;
        this.vega = vega;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegan() {
        return vega;
    }

    public double getPrice() {
        return price;
    }

    public void print() {
        System.out.println(" " + getName());
        if (isVegan()) {
            System.out.print("(V)");
        }
        System.out.print(" , " + getPrice());
        System.out.print("      ----" + getDescription());
    }
}
