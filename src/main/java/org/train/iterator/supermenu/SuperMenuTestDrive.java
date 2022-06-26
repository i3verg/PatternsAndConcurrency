package org.train.iterator.supermenu;


public class SuperMenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "BREAKFAST");
        MenuComponent dinnerMenu = new Menu("DINER MENU", "LUNCH");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "DINNER");
        MenuComponent desertMenu = new Menu("Desert MENU", "Desert");


        MenuComponent menus = new Menu("All menus", "All menus combined");
        menus.add(pancakeHouseMenu);
        menus.add(dinnerMenu);
        menus.add(cafeMenu);

        dinnerMenu.add(desertMenu);
        desertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla icecream", true, 2.55));

        SuperWaitress superWaitress = new SuperWaitress(menus);
        superWaitress.print();


    }
}
