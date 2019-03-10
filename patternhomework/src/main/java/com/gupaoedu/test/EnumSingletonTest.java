package com.gupaoedu.test;

import com.gupaoedu.register.EnumSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EnumSingletonTest {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<EnumSingleton> enumSingletonClass = EnumSingleton.class;
        Constructor<EnumSingleton> declaredConstructor = enumSingletonClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        declaredConstructor.newInstance();


    }
}
