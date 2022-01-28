/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo01
 * @description:
 * @create: 2022-01-28 16:51
 * @Version 1.0
 **/
package com.zty.array;
/*
    1.其长度是确定的。数组一旦被创建，它的大小就是不可以改变的。
    2.其元素必须是相同类型,不允许出现混合类型。
    3.数组中的元素可以是任何数据类型，包括基本类型和引用类型。
    4.数组变量属引用类型，数组也可以看成是对象，数组中的每个元素相当于该对象的成员变量。
    5.数组本身就是对象，Java中对象是在堆中的，因此数组无论保存原始类型还是其他对象类型,
      数组对象本身是在堆中的。
 */
public class Demo01 {
    static int a;
    public static void main(String[] args) {
        //数组定义
        int[] nums = new int[10]; //首选方式
        int nums1[] = new int[10];  // 为了方便c/c++用户设计的。
        // 数组长度
        int length = nums.length;
        int b = 0;
        System.out.println(b);//局部变量必须初始化！
        System.out.println(a);//成员变量可以自动初始化！
    }
}
