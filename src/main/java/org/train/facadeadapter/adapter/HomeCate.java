package org.train.facadeadapter.adapter;

public class HomeCate implements Cat{
    @Override
    public void run() {
        System.out.println("Home cat running");
    }

    @Override
    public void meow() {
        System.out.println("Home cat say meow");
    }
}
