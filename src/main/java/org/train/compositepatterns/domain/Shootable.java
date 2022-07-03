package org.train.compositepatterns.domain;

import org.train.compositepatterns.srv.ShootObservable;

public interface Shootable extends ShootObservable {
    void shoot();
}
