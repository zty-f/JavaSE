/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo
 * @description:
 * @create: 2022-01-27 15:44
 * @Version 1.0
 **/
package main.zty.operator运算符;

public class Demo01 {
    public static void main(String[] args) {
        double d = 1000.0;
        long l = 1122445664L;
        int a = 44;
        short b = 13;
        byte c = 4;
        //类型转换：int以下类型运算默认转int，int以上的进行运算以最高的为准！
        //运算时默认先转换为操作数中最高的类型再进行运算
        System.out.println(getType(d+l+a+b+c));//double
        System.out.println(getType(l+a+b+c));//long
        System.out.println(getType(a+b+c));//Integer
        System.out.println(getType(b+c));//Integer
    }
    public static String getType(Object o) { //获取变量类型方法
        return o.getClass().toString(); //使用类型的getClass()方法
    }
}
