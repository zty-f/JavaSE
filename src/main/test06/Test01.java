package main.test06;

/**
 * @version V1.0
 * @ClassName: main.test06.Test01.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-13 22:13
 * @Description:
 */
public class Test01 {
    public void Test01(){//可以和类名重复
        System.out.println("aaaa");
    }
    public static void main(String[] args) {
        int a = 0b10;// 0b开的对应二进制
        int b = 0x10; // 0x开头代表16进制
        int c = 010; //0开头代表8进制
        System.out.println(a); //2
        System.out.println(b); //16
        System.out.println(c); //8

        new Test01().Test01();


        System.out.println((int)(1.732*100)/100.0);//1.73
    }
}
