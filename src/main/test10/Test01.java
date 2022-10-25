package main.test10;

import java.util.Arrays;

/**
 * @version V1.0
 * @ClassName: main.test10.Test01.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-10-25 15:21
 * @Description: 堆排序
 */
public class Test01 {
    public static void main(String[] args) {
        int[] x = {1,3,6,4,5,9,2};
        heapSort(x);
        System.out.println(getTheNMax(x, 4));
    }


    public static int getTheNMax(int[] x,int k){
        int n = x.length;
        //生成大根堆
        for (int i = n/2-1; i>=0; i--) {
            heapJust(x,i,n-1);
        }
        for (int i = n-1; i >=n-k+1; i--) {
            swap(x,0,i);
            heapJust(x,0,i-1);
        }
        return x[0];
    }
    public static void heapSort(int[] x){
        int n = x.length;
        //生成大根堆
        for (int i = n/2-1; i>=0; i--) {
            heapJust(x,i,n-1);
        }
        for (int i = n-1; i >=0; i--) {
            swap(x,0,i);
            heapJust(x,0,i-1);
        }
        System.out.println(Arrays.toString(x));
    }

    public static void heapJust(int[] x,int begin,int end){
        for (int i = begin; i <= end; i++) {
            if(i*2+1<=end&&x[i]<x[i*2+1]){
                swap(x,i,i*2+1);
            }
            if(i*2+2<=end&&x[i]<x[i*2+2]){
                swap(x,i,i*2+2);
            }
        }
    }

    public static void swap(int[] x,int i,int j){
        int t = x[i];
        x[i] = x[j];
        x[j] = t;
    }


}
