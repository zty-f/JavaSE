package main.test03;

public enum Singleton05 { //单例模式，懒加载，能够解决并发问题，同时可以防止通过反射进行篡改    推荐使用！
    INSTANCE;

    private static Singleton05 getInstance(){
        return INSTANCE;
    }
}
