package com.gupaoedu.lazy;

public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    //JDK1.6 之后对synchronized性能优化了不少，但是还是存才一定的性能问题
    //造成整个类被死锁
    public synchronized static LazySingleton getInstance() {
        if (null == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
