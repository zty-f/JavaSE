package com.zty.蓝桥杯;

import java.util.Scanner;

//字母图形
/*
利用字母可以组成一些美丽的图形，下面给出了一个例子：
ABCDEFG
BABCDEF
CBABCDE
DCBABCD
EDCBABC
这是一个5行7列的图形，请找出这个图形的规律，并输出一个n行m列的图形。
 */
public class Demo06 {
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		char[][] res = new char[m][n];
		for (int i = 0; i < (m<n?m:n); i++) {
			res[i][i] = 'A';
			for (int j = i+1; j < n; j++) {
				res[i][j] = (char) (res[i][j-1]+1);
			}
			for (int j = i+1; j < m; j++) {
				res[j][i] = (char) (res[j-1][i]+1);
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(res[i][j]);
			}
			System.out.println();
		}
		scanner.close();
	}
}