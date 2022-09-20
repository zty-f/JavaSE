package main.test07;

/**
 * @version V1.0
 * @ClassName: main.test07.Test03.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-20 20:26
 * @Description:
 */
class A{
    static {
        System.out.println("staticA");
    }

    {
        System.out.println("AAA");
    }

    public A(){
        System.out.println("A");
    }
}
// 先静后动
// 先父后子
// 先变量，代码块，构造方法！
class B extends A{
    static {
        System.out.println("staticB");
    }

    {
        System.out.println("BBB");
    }

    public B(){
        System.out.println("B");
    }
}

public class Test03 {
    public static void main(String[] args) {
        new B();
        /*
        staticA
        staticB
        AAA
        A
        BBB
        B
         */
    }
}
