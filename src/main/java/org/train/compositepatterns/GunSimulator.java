package org.train.compositepatterns;

import org.train.compositepatterns.domain.ShootCounter;
import org.train.compositepatterns.domain.ShootLogist;
import org.train.compositepatterns.domain.Shootable;
import org.train.compositepatterns.factory.AbstractGunFactory;
import org.train.compositepatterns.factory.CountingShootingFactory;
import org.train.compositepatterns.srv.Kit;

public class GunSimulator {
    public static void main(String[] args) {
        GunSimulator gunSimulator = new GunSimulator();
        AbstractGunFactory abstractGunFactory = new CountingShootingFactory();
        gunSimulator.simulate(abstractGunFactory);
    }

    void simulate(AbstractGunFactory abstractGunFactory) {
        Shootable assaultWeapon = abstractGunFactory.createAssaultWeapon();
        Shootable doomShootgun = abstractGunFactory.createDoomShootGun();
        Shootable toyAssaultWeapon = abstractGunFactory.createToyGun();
        Shootable testWeapon = abstractGunFactory.createAssaultWeapon();

        System.out.println("Simulate");

        simulate(assaultWeapon);
        simulate(doomShootgun);
        simulate(toyAssaultWeapon);


        Kit shootKit = new Kit();
        shootKit.add(assaultWeapon);
        shootKit.add(doomShootgun);
        shootKit.add(toyAssaultWeapon);
        System.out.println("_____________________________________________");

        simulate(shootKit);

        ShootLogist shootLogist = new ShootLogist();
        shootKit.registerObserver(shootLogist);
        simulate(shootKit);

        System.out.println(ShootCounter.getShoots());

    }

    void simulate(Shootable shooting) {
        shooting.shoot();
    }
}
