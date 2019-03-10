package com.gupaoedu.pattern.simpleFactory;

public class SimpleFactory {

    public Fruit createFruit(String name) {
        if ("apple".equals(name)) {
            return new Apple();
        } else if ("banana".equals(name)) {
            return new Banana();
        }

        return null;
    }


    public Fruit createFruitByReflect(String name) {
        try {
            if ((!(null == name || "".equals(name)))) {
                Class<?> aClass = Class.forName(name);
                return (Fruit) aClass.newInstance();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Fruit createFruit(Class clazz) {
        try {
            if (null != clazz) {

                return (Fruit) clazz.newInstance();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
