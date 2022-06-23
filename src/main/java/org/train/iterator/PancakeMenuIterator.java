package org.train.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeMenuIterator implements Iterator {
    ArrayList<MenuItem> menuItems;
    Iterator iterator;

    public PancakeMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
        this.iterator = menuItems.iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Object next() {
        return iterator.next();
    }
}
