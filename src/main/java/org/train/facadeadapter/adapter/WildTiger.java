package org.train.facadeadapter.adapter;

public class WildTiger implements Tiger{
    @Override
    public void run() {
        System.out.println("Wild tiger running fastest");
    }

    @Override
    public void growl() {
        System.out.println("Wild tiger growling");
    }
}
