package org.train.singleton;

public class Boiler {
    private boolean isEmpty;
    private boolean boiled;

    private static Boiler boilerInstance;

    public static synchronized Boiler getInstance(){
        if (boilerInstance == null) {
            boilerInstance = new Boiler();
        }
        return boilerInstance;
    }

    private Boiler() {
        isEmpty = true;
        boiled = false;
    }

    public void fill(){
        if (isEmpty){
            isEmpty = false;
            boiled = false;

        }
    }
}
