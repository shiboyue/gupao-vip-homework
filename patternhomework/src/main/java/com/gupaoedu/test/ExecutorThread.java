package com.gupaoedu.test;

import com.gupaoedu.lazy.LazyDoubleCheckSingleton;

public class ExecutorThread implements Runnable {

    @Override
    public void run() {

        LazyDoubleCheckSingleton lazySingleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ": " + lazySingleton);

    }
}
