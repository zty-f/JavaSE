package main.test01;

import java.util.Arrays;

/**
 * @version V1.0
 * @ClassName: main.test.Test13.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-04-24 15:04
 * @Description: 数组两数求和等于某数字的和
 */
public class Test14 {
    public static void main(String[] args) {
        System.out.println(solve(new int[1], 1, 7));
    }
    static int solve(int[] arr, int n, int m) {
        if (n==0){
            return 0;
        }
        Arrays.sort(arr);
        int l = 0,r = n-1;
        int res = 0;
        while (l<=r){
            if(arr[l]+arr[r]==m){
                res++;
                l++;
            }else if(arr[l]+arr[r]<m){
                l++;
            }else {
                r--;
            }
        }
        return res;
    }
}
