package org.train.iterator;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int position;

    public DinnerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.length && menuItems[position] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[position];
        position = position + 1;
        return menuItem;
    }
}
