package com.gupaoedu.test;

public class LazyTest {


    public static void main(String[] args) {

        //LazySingleton instance = LazySingleton.getInstance();
        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());

        t1.start();
        t2.start();

        System.out.println("Execute End!!!");

    }
}
