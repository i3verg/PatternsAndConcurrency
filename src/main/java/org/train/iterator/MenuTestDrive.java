package org.train.iterator;

import org.train.iterator.cafe.CafeMenu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MenuTestDrive {
    public static void main(String[] args) {
        List<Menu> menuList = new ArrayList<>();
        menuList.add(()-> new PancakeHouseMenu().createIterator());
        menuList.add(()-> new DinerMenu().createIterator());
        menuList.add(()-> new CafeMenu().createIterator());


        Waitress waitress = new Waitress(menuList);
        waitress.printMenu();
    }
}
