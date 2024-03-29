package org.train.compositepatterns.domain;

import org.train.compositepatterns.srv.ShootObservable;

public interface Observer {
    void update(ShootObservable observable);
}
