package com.zty.蓝桥杯;

import java.util.Scanner;

//查找整数  给出一个包含n个整数的数列，问整数a在数列中的第一次出现是第几个。
public class Demo08 {
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] tmp = new int[n];
		for (int i = 0; i < n; i++) {
			tmp[i] = scanner.nextInt();
		}
		int find = scanner.nextInt();
		int i = 0;
		for (; i < n; i++) {
			if(tmp[i] == find){
				System.out.println(i+1);
				break;
			}
		}
		if(i==n){
			System.out.println(-1);
		}
		scanner.close();
	}
}