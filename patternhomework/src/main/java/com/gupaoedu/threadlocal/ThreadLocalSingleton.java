package com.gupaoedu.threadlocal;

public class ThreadLocalSingleton {

    private ThreadLocalSingleton() {
    }

    private static final ThreadLocal<ThreadLocalSingleton>
            threadLocalSingleton = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };


    public ThreadLocalSingleton getInstance() {
        return threadLocalSingleton.get();
    }


}
