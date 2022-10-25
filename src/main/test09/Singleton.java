package main.test09;


// 使用枚举实现单例模式

//1.简单实现
enum Singleton1 {
    INSTANCE;
    public final String name = "单例";
    public void businessMethod() {
        System.out.println("我是一个单例！");
    }

    @Override
    public String toString() {
        return "Singleton1{" +
                "name='" + name + '\'' +
                '}';
    }
}

// 将已有类改造为单例模式
public class Singleton {
    private Singleton(){
    }   
    public static enum SingletonEnum {
        SINGLETON;
        private Singleton instance;
        private SingletonEnum(){
            instance = new Singleton();
        }
        public Singleton getInstance(){
            return instance;
        }
    }
    private String name = "单例";
    public void businessMethod() {
        System.out.println("我是一个单例！");
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Test{
    public static void main(String[] args) {
        Singleton i1 = Singleton.SingletonEnum.SINGLETON.getInstance();
        Singleton i2 = Singleton.SingletonEnum.SINGLETON.getInstance();
        i1.businessMethod();
        System.out.println(i1);
        System.out.println(i1==i2);
        Singleton1 instance1 = Singleton1.INSTANCE;
        Singleton1 instance2 = Singleton1.INSTANCE;
        System.out.println(instance1==instance2);
        instance1.businessMethod();
        System.out.println(instance1.name);
        System.out.println(instance1);
    }
}

