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

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException
                    ("You can’t remove an item until you’ve done at least one next()");
        }
        if (menuItems[position - 1] != null) {
            if (menuItems.length - 1 - (position - 1) >= 0)
                System.arraycopy(menuItems, position - 1 + 1, menuItems, position - 1, menuItems.length - 1 - (position - 1));
            menuItems[menuItems.length - 1] = null;
        }
    }
}
