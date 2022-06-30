package org.train.decorator;

public class CoffeeShop {
    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println("Bev is "+ beverage.getDesc());
        System.out.println("It cost - " +beverage.cost());

        Beverage anotherBeverage = new HouseBlend();
        anotherBeverage = new Mocha(anotherBeverage);
        anotherBeverage = new Mocha(anotherBeverage);
        anotherBeverage = new Whip(anotherBeverage);

        System.out.println("Bev is " + anotherBeverage.getDesc());
        System.out.println("it cost " + anotherBeverage.cost());

        Beverage beverageLast = new Espresso();
        beverageLast.setSize(Beverage.Size.GRANDE);
        beverageLast = new Soy(beverage);

        Beverage beverage1 = new Espresso();

        Mocha mocha = new Mocha(new Whip(beverage1));


        System.out.println("last bev is " + beverageLast.getDesc() + " it cost " + beverageLast.cost());
        System.out.println(mocha.getDesc());
        System.out.println(mocha.cost());

    }
}
