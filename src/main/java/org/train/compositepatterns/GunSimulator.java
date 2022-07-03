package org.train.compositepatterns;

import org.train.compositepatterns.domain.ShootCounter;
import org.train.compositepatterns.domain.ShootLogist;
import org.train.compositepatterns.domain.Shooting;
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
        Shooting assaultWeapon = abstractGunFactory.createAssaultWeapon();
        Shooting doomShootgun = abstractGunFactory.createDoomShootGun();
        Shooting toyAssaultWeapon = abstractGunFactory.createToyGun();
        Shooting testWeapon = abstractGunFactory.createAssaultWeapon();

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

        System.out.println(ShootCounter.getShoots());

    }

    void simulate(Shooting shooting) {
        shooting.shoot();
    }
}
