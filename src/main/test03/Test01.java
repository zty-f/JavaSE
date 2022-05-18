package main.test03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @version V1.0
 * @ClassName: main.test03.Test01.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-05-18 08:25
 * @Description: 无重复数字的全排列
 */
public class Test01 {
    static List<int[]> list;
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        list = new ArrayList<>();
        init(0,nums);
        for (int[] ints : list) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void init(int index,int[] nums){
        if(index==nums.length){
            list.add(Arrays.copyOf(nums,nums.length));
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(i,index,nums);
            init(index+1,nums);
            swap(i,index,nums);
        }
    }
    public static void swap(int i,int j,int[] nums){
        int t = nums[j];
        nums[j] = nums[i];
        nums[i] = t;
    }
}
