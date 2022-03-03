/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo02
 * @description:
 * @create: 2022-01-26 17:45
 * @Version 1.0
 **/
package main.zty.基础语法;

public class Demo02 {
    public static void main(String[] args) {
        // 整数扩展
        int a = 10; //十进制
        int b = 010; //八进制
        int c = 0x11; //十六进制
        System.out.println(a);//10
        System.out.println(b);//8  8^1+8^0
        System.out.println(c);//17  16^1+16^0

        System.out.println("=====================================================");

        //字符扩展   unicode编码
        char z = '张',t = '天',y = '泳';
        System.out.println((int)z);
        System.out.println((int)t);
        System.out.println((int)y);

        char x = '\u0061';
        System.out.println(x); // a

        System.out.println("======================================================");
        // 转义字符
        System.out.println("hello\tworld");// 制表符
        System.out.println("hello\nworld");// 换行符

        System.out.println("=================================================");

        String sa = new String("ztyfmj");
        String sb = new String("ztyfmj");

        String sc = "ztyfmj";
        String sd = "ztyfmj";

        System.out.println(sa==sb);//false  new出来的地址不同，引用型类型！
        System.out.println(sc==sd);//true   两个内容相同，并且同时指向同一个地址，所以相同！
    }
}
