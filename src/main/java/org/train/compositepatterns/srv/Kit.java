package org.train.compositepatterns.srv;

import org.train.compositepatterns.domain.Observer;
import org.train.compositepatterns.domain.Shootable;

import java.util.ArrayList;

public class Kit implements Shootable {
    ArrayList<Shootable> shootKit = new ArrayList<>();

    public void add(Shootable subject) {
        shootKit.add(subject);
    }

    @Override
    public void shoot() {
        shootKit.forEach(Shootable::shoot);
    }


    @Override
    public void registerObserver(Observer observer) {
        shootKit.forEach(weapon -> weapon.registerObserver(observer));
    }

    @Override
    public void notifyObservers() {

    }
}
