package main.test08;

import java.util.Arrays;

/**
 * @version V1.0
 * @ClassName: main.test08.Test11.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-10-07 20:51
 * @Description: 快排实现
 */
public class Test11 {


    public static void main(String[] args) {
        int[] x = new int[]{2,1,5,3,8,6,7,4,9,10};

        quickSort(x,0,x.length-1);
        System.out.println("升序序列为"+Arrays.toString(x));
    }


    public static void quickSort(int[] x,int l,int r){
        if(l<r){
            int p = partition(x,l,r);
            quickSort(x,l,p-1);
            quickSort(x,p+1,r);
        }
    }

    public static int partition(int[] x,int l,int r){
        int point = l;
        int index = point+1;
        for (int i = index; i <= r; i++) {
            if(x[i]<x[point]){
                swap(x,i,index++);
            }
        }
        swap(x,point,index-1);
        return index-1;
    }

    public static void swap(int[] x,int i,int j){
        int t = x[i];
        x[i] = x[j];
        x[j] = t;
    }
}
