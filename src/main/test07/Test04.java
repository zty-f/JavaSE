package main.test07;

/**
 * @version V1.0
 * @ClassName: main.test07.Test04.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-23 20:52
 * @Description: 变量定义
 */

class Q{
    public void w(){}

    public static void x(){}
}

public class Test04 extends Q{
    /*
    在类方法中，不能引用实例变量

   不能使用super、this关键字
     */
    public static void main(String[] args) { //类方法不能使用this和super关键字
        //int @mat = 1; //错误
        int h$u = 1;
        //int 8u = 1; //错误
        int $1 = 4;
        //int #q = 2; // 错误

        //static int i = 1; //错误，类变量只能在方法外

        int[] x = new int[25];
        System.out.println(x[24]);

        new Test04().Test04();

        //int x = [] = {21,22}; 错误声明
        Test04.x();
    }

    public static void a(){
        System.out.println("aaaaaaa");
    }

    public void Test04(){
        b();
        this.a();
        a();
        Test04.x();
        System.out.println("123456");
    }

    public static void c(){
        Test04.x();
    }

    public void b(){
        Test04();
        Test04.a();
        a();
        x();
        w();
    }
}
