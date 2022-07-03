package org.train.compositepatterns.srv;

import org.train.compositepatterns.domain.Observer;
import org.train.compositepatterns.domain.Shooting;

import java.util.ArrayList;
import java.util.Iterator;

public class Kit implements Shooting {
    ArrayList<Shooting> shootKit = new ArrayList<>();

    public void add(Shooting subject){
        shootKit.add(subject);
    }

    @Override
    public void shoot() {
        shootKit.forEach(Shooting::shoot);
    }


    @Override
    public void registerObserver(Observer observer) {
        Iterator<Shooting> iterator = shootKit.iterator();
        while (iterator.hasNext()){
            Shooting weapon = iterator.next();
            weapon.registerObserver(observer);        }
    }

    @Override
    public void notifyObservers() {

    }
}
