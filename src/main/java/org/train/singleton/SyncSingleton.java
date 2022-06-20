package org.train.singleton;

public class SyncSingleton {

    private static volatile SyncSingleton syncInstance;

    private SyncSingleton() {
    }

    public static SyncSingleton getSyncInstance(){
        if (syncInstance == null){
            synchronized (SyncSingleton.class){
                if (syncInstance == null){
                    syncInstance = new SyncSingleton();
                }
            }
        }
        return syncInstance;
    }
}
