package com.zty.蓝桥杯;

import java.util.Arrays;
import java.util.Scanner;

//区间k大数查询  给定一个序列，每次询问序列中第l个数到第r个数中第K大的数是哪个。
public class Demo09 {
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] tmp = new int[n];
		for (int i = 0; i < n; i++) {
			tmp[i] = scanner.nextInt();
		}
		int m = scanner.nextInt();
		for (int i = 0; i < m; i++) {
			int l = scanner.nextInt();
			int r = scanner.nextInt();
			int k = scanner.nextInt();
			int size = r-l+1;
			int[] tt = new int[size];
			int index = 0;
			for (int j = l-1; j <= r-1; j++) {
				tt[index] = tmp[j];
				index++;
			}
			Arrays.sort(tt);
			System.out.println(tt[size-k]);
		}
		scanner.close();
	}
}