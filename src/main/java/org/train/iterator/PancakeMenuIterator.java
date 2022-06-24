package org.train.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeMenuIterator implements Iterator {
    ArrayList<MenuItem> menuItems;
    Iterator<MenuItem> iterator;

    public PancakeMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
        this.iterator = menuItems.iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public MenuItem next() {
        return iterator.next();
    }
}
