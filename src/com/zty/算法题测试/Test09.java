/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Test09
 * @description:
 * @create: 2022-02-20 09:38
 * @Version 1.0
 **/
package com.zty.算法题测试;

import java.util.Arrays;

public class Test09 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,3,5,6,6,7};
        System.out.println(binarySearch(nums, 3));
    }
    public static int binarySearch(int[] nums,int target){
        int l = 0;
        int r = nums.length-1;
        if(r==-1)return -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]>target){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return -1;
    }
}
