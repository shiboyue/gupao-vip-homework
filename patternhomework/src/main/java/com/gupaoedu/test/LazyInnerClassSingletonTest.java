package com.gupaoedu.test;

import com.gupaoedu.vip.pattern.singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class LazyInnerClassSingletonTest {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<?> clazz = LazyInnerClassSingleton.class;

        Constructor<?> declaredConstructor = clazz.getDeclaredConstructor(null);

        declaredConstructor.setAccessible(true);

        //Object o1 = declaredConstructor.newInstance();

        Object o2 = LazyInnerClassSingleton.getInstance();

    }

}
