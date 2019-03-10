package com.gupaoedu.lazy;

public class LazyInnerClassSingleton {

    //虽然构造方法是私有的但是还是会被反射
    private LazyInnerClassSingleton() {
        //防止反射调用
        if (LazyHolder.LAZY != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    //饿汉式单例
    //JVM底层的执行逻辑
    //巧妙的利用了内部类的特性：？？内部类的执行逻辑
    //LazyHolder里面的逻辑需要等待外部的方法调用时候才执行

    public static final LazyInnerClassSingleton getInstance() {

        return LazyHolder.LAZY;
    }

    private static class LazyHolder {
        private static final LazyInnerClassSingleton
                LAZY = new LazyInnerClassSingleton();
    }
}
