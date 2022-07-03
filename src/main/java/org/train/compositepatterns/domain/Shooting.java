package org.train.compositepatterns.domain;

import org.train.compositepatterns.srv.ShootingObservable;

public interface Shooting extends ShootingObservable {
    void shoot();
}
