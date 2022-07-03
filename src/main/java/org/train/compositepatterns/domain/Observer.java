package org.train.compositepatterns.domain;

import org.train.compositepatterns.srv.ShootingObservable;

public interface Observer {
    void update(ShootingObservable observable);
}
