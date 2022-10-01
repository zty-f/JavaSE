package main.test08;

/**
 * @version V1.0
 * @ClassName: main.test08.Test05.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-10-01 10:07
 * @Description:
 */
public class Test05 {

    static {
        System.out.println("Main类初始化");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        /*
        类初始化的几种情况
         */
        // 1.new
        //Son son = new Son();
        // 2.反射调用
        //Class c = Class.forName("main.test08.Son");
        // 3.调用类的静态成员变量和静态方法（除了final常量）
        //System.out.println(Son.a);

        /*
        不会造成类的初始化的几种情况
         */
        // 1.访问一个静态域，只有真正声明这个域的类以及父类才会被初始化（Son类不会被初始化）
        //System.out.println(Son.c);
        // 2.通过数组定义类的引用不会造成类的初始化
        //Son[] sons = new Son[5];
        // 3.引用类的常量不会造成类的初始化（常量在链接阶段已经放入常量池）
        System.out.println(Son.b);
    }
}

class T{
    static {
        System.out.println("父类的父类初始化");
    }
}

class Father extends T{
    static int a = 100;

    static int c = 5;

    static {
        System.out.println("父类初始化");
    }
}

class Son extends Father{
    static int a = 1;

    static {
        System.out.println("子类初始化");
    }
    final static int  b=2;

}