package main.test;

import java.util.Arrays;

/**
 * @version V1.0
 * @ClassName: main.test.Test12.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-04-24 12:43
 * @Description: 动态规划测试  力扣骰子概率
 */
public class Test12 {
    public static void main(String[] args) {
        dicesProbability(3);
    }
    public static void dicesProbability(int n) {
        double[] dp=new double[6*n+1];
        double[] ans=new double[5*n+1];
        double all=Math.pow(6,n);
        for(int i=1;i<=6;i++){
            dp[i]=1;
            ans[i-1]=1.0/6;
        }
        for(int i=2;i<=n;i++){
            for(int j=6*i;j>=i;j--){
                int temp=0;
                for(int k=1;k<=6;k++){
                    temp+=(j-k>=i-1)?dp[j-k]:0;
                }
                dp[j]=temp;
                if(i==n){
                    ans[j-n]=dp[j]/all;
                }
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
