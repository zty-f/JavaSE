/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo03
 * @description:
 * @create: 2022-01-26 19:49
 * @Version 1.0
 **/
package main.zty.基础语法;

public class Demo03 {
    public static void main(String[] args) {
        /*byte:1字节
        short:2字节
        char:2字节无符
        int:4字节
        float:4字节
        long:8字节
        double:8字节
        */


        int i = 128;
        // 强制类型转换  （数据类型）变量名  高(多字节)——>低(少字节)
        byte b = (byte) i;
        // 自动类型转换  低(少字节)——>高(多字节)
        double d = i;

        System.out.println(i);
        System.out.println(b);
        System.out.println(d);

        /*
        注意点：
        1.不能对布尔类型进行转换
        2.不能把对象类型转换为不相干的类型
        3.把高容量转换到低容量的时候，强制转换，转换的时候可能存在内存溢出，或者精度问题！
         */
        System.out.println("=======================================");
        char c = 'A'; //A对应ASCII码65   a----->97
        int x =c+1;
        System.out.println(x); //66
        System.out.println((char) x); //B

    }
}
