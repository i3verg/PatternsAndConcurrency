package org.train.compositepatterns.domain;

public class MachineGun implements Shooting {
    @Override
    public void shoot() {
        System.out.println("Shoot from Machine gun!!!");
    }
}
