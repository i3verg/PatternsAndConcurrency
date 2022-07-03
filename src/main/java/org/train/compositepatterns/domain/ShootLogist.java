package org.train.compositepatterns.domain;

import org.train.compositepatterns.srv.ShootingObservable;

public class ShootLogist implements Observer {
    @Override
    public void update(ShootingObservable shooting) {
        System.out.println("Shootlogist : " + shooting + " just shot");
    }
}
