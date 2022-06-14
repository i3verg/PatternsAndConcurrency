package org.train.observer.java.impl;

import org.train.observer.java.base.DisplayElement;
import org.train.observer.java.base.Observer;
import org.train.observer.java.base.Subject;

public class CCD implements Observer, DisplayElement {

    private Subject wd;

    public CCD(Subject wd) {
        this.wd = wd;
        wd.registerObserver(this);
    }

    @Override
    public void display() {

    }

    @Override
    public void update(int temp, int pressure) {

    }



}
