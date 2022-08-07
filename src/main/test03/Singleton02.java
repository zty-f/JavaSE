package main.test03;

/**
 * @version V1.0
 * @ClassName: main.test03.Singleto02.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-08-07 16:01
 * @Description: 手写单例模式2
 */
public class Singleton02 {

    private static  Singleton02 instance;

    private Singleton02(){

    }

    public static Singleton02 getInstance(){// 起到了懒加载的作用，但是没有解决多线程问题（可以直接方法添加Synchronized解决，但是效率很低，不推荐使用）
        if (instance==null){
            instance = new Singleton02();
        }
        return instance;
    }
}
