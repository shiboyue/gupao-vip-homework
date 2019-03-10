package com.gupaoedu.lazy;

public class LazyDoubleCheckSingleton {


    private volatile static LazyDoubleCheckSingleton lazySingleton = null;

    private LazyDoubleCheckSingleton() {

    }

    //双重检查锁
    public static LazyDoubleCheckSingleton getInstance() {
        if (null == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazySingleton == null) {
                    //CPU执行的时候会转换成JVM指令来执行
                    /**
                     * 1. 分配内存给这个对象
                     * 2. 初始化对象
                     * 3. 将初始化好的对象和内存地址建立关联
                     * 4. 用户初次访问
                     *
                     * 第2，3 的顺序会颠倒，指令重排序问题，volatile
                     */
                    lazySingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazySingleton;
    }
}
