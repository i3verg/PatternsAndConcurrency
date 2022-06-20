package org.train.facadeadapter.adapter;

public class CatTestDrive {
    public static void main(String[] args) {

        HomeCate homeCate = new HomeCate();

        WildTiger wildTiger = new WildTiger();
        Cat tigerAdapter = new TigerAdapter(wildTiger);

        System.out.println("Tiger behaviour");
        wildTiger.growl();
        wildTiger.run();

        System.out.println("Tiger adapter behaviour");
        testDuck(tigerAdapter);

        System.out.println("Home cat behaviour");
        testDuck(homeCate);
    }
    static void testDuck(Cat cat){
        cat.run();
        cat.meow();
    }
}
