package main.test;

/**
 * @version V1.0
 * @ClassName: main.test.Test06.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-03-31 19:49
 * @Description: 类方法、实例方法，类变量，实例变量
 */

//类和实例的主要区别是有没有  static 修饰符
public class Test06 {
    static int a = 1;
    int b = 1;

    static void x(){
        System.out.println(a);
        //System.out.println(b); //报错，不能使用实例变量
    }
    void y(){
        System.out.println(a);
        System.out.println(b);
    }

}
