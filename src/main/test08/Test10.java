package main.test08;

import java.util.Arrays;

/**
 * @version V1.0
 * @ClassName: main.test08.Test10.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-10-07 20:25
 * @Description: 堆排序实现!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 */
public class Test10 {

    public static void main(String[] args) {
        int[] x = new int[]{4,5,1,2,3,4,6,7,9,23,8};
        maxHeapSort(x);
        minHeapSort(x);
    }

    // 调整begin-end节点为大根堆
    public static void adjustMaxHeap(int[] x,int begin,int end){
        for (int i = begin; i < end; i++) {
            int p = i*2+1;
            if(p<end&&x[p]>x[begin]){
                swap(x,begin,p);
            }
            if (p+1<end&&x[p+1]>x[begin]){
                swap(x,begin,p+1);
            }
        }
    }

    public static void maxHeapSort(int[] x){
        int len = x.length;

        for (int i = len/2-1; i >=0; i--) {
            adjustMaxHeap(x,i,len);
        }

        for (int i = len-1; i >=0; i--) {
            swap(x,0,i);
            adjustMaxHeap(x,0,i);
        }
        System.out.println("升序排列为："+Arrays.toString(x));
    }

    // 调整begin-end节点为大根堆
    public static void adjustMinHeap(int[] x,int begin,int end){
        for (int i = begin; i < end; i++) {
            int p = i*2+1;
            if(p<end&&x[p]<x[begin]){
                swap(x,begin,p);
            }
            if (p+1<end&&x[p+1]<x[begin]){
                swap(x,begin,p+1);
            }
        }
    }

    public static void minHeapSort(int[] x){
        int len = x.length;

        for (int i = len/2-1; i >=0; i--) {
            adjustMinHeap(x,i,len);
        }

        for (int i = len-1; i >=0; i--) {
            swap(x,0,i);
            adjustMinHeap(x,0,i);
        }
        System.out.println("降序排列为："+Arrays.toString(x));
    }

    public static void swap(int[] x,int i,int j){
        int t = x[i];
        x[i] = x[j];
        x[j] = t;
    }
}
