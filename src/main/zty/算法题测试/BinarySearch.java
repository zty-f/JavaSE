package main.zty.算法题测试;

import java.util.Arrays;

//最快二分查找
//使用逻辑右移运输费代替 /2
//  >> 算术右移（相当于乘法除法）    >>> 逻辑右移（不管正负数都高位补0），相当于取绝对值再除二
public class BinarySearch {
    public static void main(String[] args) {
       int[] arr = new int[]{1,4,5,4,9,7,4};
        Arrays.sort(arr);
       int target = 9;
        System.out.println(binarySearch(arr,target));
    }
    public static int binarySearch(int[] arr, int target) {
        if (arr == null || arr.length <= 1) {
            return -1;
        }

        int left = 0;
        int right = arr.length - 1;

        //1.
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (arr[mid] > target) {
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }

        // 2.
        //while(l<r){
        //    long mid = (l+r)>>1;//向下取整
        //    if(mid*mid>x){
        //        r = mid;
        //    }else{
        //        l = mid+1;
        //    }
        //}//结束循环最终l==r
        //return (int)l-1;

        // 3
        // while(l<r){
        //     long mid = (l+r+1)>>1;//向上取整  搭配使用
        //     if(mid*mid>x){
        //         r = mid-1;
        //     }else{
        //         l = mid;
        //     }
        // }//结束循环最终l==r
        // return (int)l;

        return -1;
    }
}
