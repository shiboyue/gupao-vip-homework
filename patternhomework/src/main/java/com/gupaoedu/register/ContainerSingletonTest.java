package com.gupaoedu.register;

public class ContainerSingletonTest {

    public static void main(String[] args) {

        Object bean = ContainerSingleton.getBean("com.gupaoedu.vip.pattern.singleton.register.Pojo");

        System.out.println(bean);
    }
}
