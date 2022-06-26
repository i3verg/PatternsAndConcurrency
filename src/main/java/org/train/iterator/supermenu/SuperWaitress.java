package org.train.iterator.supermenu;

public class SuperWaitress {

    MenuComponent menus;

    public SuperWaitress(MenuComponent menus) {
        this.menus = menus;
    }

    public void print() {
        menus.print();
    }
}
