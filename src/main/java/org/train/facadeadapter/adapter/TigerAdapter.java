package org.train.facadeadapter.adapter;

public class TigerAdapter implements Cat {
    Tiger tiger;

    public TigerAdapter(Tiger tiger) {
        this.tiger = tiger;
    }

    @Override
    public void run() {
        tiger.run();
    }

    @Override
    public void meow() {
        for (int i = 0; i < 5; i++) {
            tiger.growl();
        }
    }
}
