package main.zty.蓝桥杯;

import java.util.Scanner;

//K好数
/*
如果一个自然数N的K进制表示中任意的相邻的两位都不是相邻的数字，那么我们就说这个数是K好数。
求L位K进制数中K好数的数目。例如K = 4，L = 2的时候，所有K好数为11、13、20、22、30、31、33 共7个。
由于这个数目很大，请你输出它对1000000007取模后的值。
 */
public class Demo11 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		long mod = 1000000007;
		int radix = sc.nextInt();
		int length = sc.nextInt();
		long dp[][] = new long[length][radix];
		//二维数组第一维是表示长度，第二维表示该长度下开头的数字，该数组的值为满足前二条件的K好数的个数
		for (int i = 0; i < radix; i++) {
			dp[0][i] = 1;
		}
		for (int m = 1; m < length; m++) {
			for (int j = 0; j < radix; j++) {
				for (int x = 0; x < radix; x++) {
					if (x != j + 1 && x != j - 1) {
						//如果m位长的开头为j，m-1位长开头为x，并且x与j不相临
                        dp[m][j] += dp[m - 1][x];
						dp[m][j] %= mod;
					}
				}
			}
		}
		long sum = 0;
		//由于K好数不能以0开头，所以从1开始取
		for (int y = 1; y < radix; y++) {
			sum += dp[length - 1][y];
			sum %= mod;
		}
		System.out.println(sum);
	}
}