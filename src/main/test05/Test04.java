package main.test05;

/**
 * @version V1.0
 * @ClassName: main.test05.Test04.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-08 18:38
 * @Description: 算法
 *
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 子数组 是数组中的一个连续部分。
 *
 * 示例 1：
 *
 * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出：6
 * 解释：连续子数组[4,-1,2,1] 的和最大，为6 。
 *
 * 链接：https://leetcode.cn/problems/maximum-subarray
 */
public class Test04 {
    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};

        int n = nums.length;

        int max = nums[0];

        // 动态规划！！
        for (int i = 1; i < n; i++) {
            nums[i] = Math.max(nums[i],nums[i-1]+nums[i]);
            max = Math.max(max,nums[i]);
        }


        System.out.println(max);
    }
}
