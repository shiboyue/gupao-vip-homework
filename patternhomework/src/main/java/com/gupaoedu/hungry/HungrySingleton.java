package com.gupaoedu.hungry;

public class HungrySingleton {

    private static final HungrySingleton instace = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return instace;
    }

}
