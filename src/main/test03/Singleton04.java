package main.test03;

/**
 * @version V1.0
 * @ClassName: main.test03.Singleton04.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-08-07 16:16
 * @Description: 手写单例模式04
 */
public class Singleton04 { //静态内部类，只有调用getInstance方法的时候才会加载静态内部类，也是一次加载，同时JVM还能保证类加载时的线程安全性。  推荐使用！！！！
    private Singleton04(){}  // 存在通过反射获取实例破坏单例模式的情况发生

    private static class InnerSingleton{
        private static final Singleton04 instance = new Singleton04();
    }

    private static Singleton04 getInstance(){
        return InnerSingleton.instance;
    }
}
