package com.gupaoedu.test;

import com.gupaoedu.lazy.LazySingleton;

public class ExecutorThreadTest implements Runnable {

    @Override
    public void run() {

        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ": " + lazySingleton);

    }
}
