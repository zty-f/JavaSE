/**
 * @author: zty
 * @program: JavaSE
 * @ClassName BubbleSort
 * @description:
 * @create: 2022-01-28 19:35
 * @Version 1.0
 **/
package com.zty.array;

import java.util.Arrays;

//冒泡排序！！！
public class BubbleSort {
    public static void main(String[] args) {
        int []a = {1,2,6,9,7,11,25,14,2,13};
        bubbleSort(a);//引用类型传参相当于在原数组上进行操作！
        System.out.println(Arrays.toString(a));
    }
    public static void bubbleSort(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            int f = 0;
            for (int j = 0; j < a.length-i-1; j++) {
                 if(a[j]>a[j+1]){
                     int t = a[j];
                     a[j] = a[j+1];
                     a[j+1] = t;
                     f = 1;
                 }
            }
            if(f==0)break;
        }
    }
}
