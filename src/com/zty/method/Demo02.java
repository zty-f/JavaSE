/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo02
 * @description:
 * @create: 2022-01-28 16:09
 * @Version 1.0
 **/
package com.zty.method;

public class Demo02 {
    public static void main(String[] args) {
        Demo02 demo02 = new Demo02();
        demo02.test(1,2,3,4);
    }
    //JDK1.5方法的可变参数！！相当于传入一个数组。
    /*
    1.一个方法只能有一个可变参数，格式为：参数类型...参数名
    2.可变参数必须在方法的其他参数的最后。
     */
    public void test(int...i){
        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);
        System.out.println(i[3]);
    }
}
