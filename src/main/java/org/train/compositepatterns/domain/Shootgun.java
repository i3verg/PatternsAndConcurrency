package org.train.compositepatterns.domain;

import org.train.compositepatterns.domain.Shooting;

public class Shootgun implements Shooting {
    @Override
    public void shoot() {
        System.out.println("Shoot from shoot gun");
    }
}
