/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo03
 * @description:
 * @create: 2022-02-12 21:03
 * @Version 1.0
 **/
package com.api.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Demo03 {
    public static void main(String[] args) {
        String[] strs = new String[]{"James", "AA", "John",
                "Patricia","Dlei" , "Robert","Boom", "Cao" ,"black" ,
                "Michael", "Linda","cao","after","sa"};

        // public static <T> void sort(T[] a, Comparator<? super T> c)
        // 需求：按照元素的首字符(忽略大小写)升序排序！！！
        //原始格式
        /*Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);//按照元素的首字符(忽略大小写)
            }
        });*/

        //lambda普通格式  最长用，通俗易懂！！！
        Arrays.sort(strs, ( s1,  s2 ) ->  s1.compareToIgnoreCase(s2));

        // 特定类型的方法引用格式：
        //Arrays.sort(strs,  String::compareToIgnoreCase);

        System.out.println(Arrays.toString(strs));
    }
}
