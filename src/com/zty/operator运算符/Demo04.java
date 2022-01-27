/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo04
 * @description:
 * @create: 2022-01-27 16:18
 * @Version 1.0
 **/
package com.zty.operator运算符;

public class Demo04 {
    public static void main(String[] args) {
        /*
        A = 1100 1100
        B = 1010 0010
       -------------------
        A&B=1000 0000
        A|B=1110 1110
        A^B=0110 1110
        ~A =0011 0011
         */
        //面试题
        /*
        >>右移  /2
        <<左移  *2
        位运算效率高！！！！！！
         */
        System.out.println(2>>3);//0
        System.out.println(2<<3);//16
        System.out.println(12>>3);//1
    }
}
