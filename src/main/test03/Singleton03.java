package main.test03;

/**
 * @version V1.0
 * @ClassName: main.test03.Singleton03.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-08-07 16:05
 * @Description: 手写单例模式03
 */
public class Singleton03 {  //经典的双重检测锁模式，推荐使用
    private static volatile Singleton03 instance;

    private Singleton03(){}

    private static Singleton03 getInstance(){
        if(instance==null){
            synchronized (Singleton03.class){
                if (instance==null){
                    instance = new Singleton03();
                }
            }
        }
        return instance;
    }
}

