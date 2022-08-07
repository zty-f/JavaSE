package main.test03;

/**
 * @version V1.0
 * @ClassName: main.test03.Singleton01.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-08-07 15:57
 * @Description: 手写单例模式1
 */
public class Singleton01 {
    private static final Singleton01 instance = new Singleton01(); //存在内存耗费危险 没有实现懒加载

    private Singleton01(){

    }

    public static Singleton01 getInstance() {
        return instance;
    }
}
