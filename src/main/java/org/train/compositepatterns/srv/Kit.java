package org.train.compositepatterns.srv;

import org.train.compositepatterns.domain.Shooting;

import java.util.ArrayList;

public class Kit implements Shooting {

    ArrayList<Shooting> shootKit = new ArrayList<>();

    public void add(Shooting subject){
        shootKit.add(subject);
    }

    @Override
    public void shoot() {
        shootKit.forEach(Shooting::shoot);
    }
}
