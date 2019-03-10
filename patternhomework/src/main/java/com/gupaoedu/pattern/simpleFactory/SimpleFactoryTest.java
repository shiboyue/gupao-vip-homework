package com.gupaoedu.pattern.simpleFactory;

public class SimpleFactoryTest {

    public static void main(String[] args) {

        SimpleFactory simpleFactory = new SimpleFactory();

        Fruit apple = simpleFactory.createFruit("apple");

    }
}
