package org.train.compositepatterns.domain;

import org.train.compositepatterns.srv.ShootObservable;

public class ShootLogist implements Observer {
    @Override
    public void update(ShootObservable shooting) {
        System.out.println("Shootlogist : " + shooting + " just shot");
    }
}
