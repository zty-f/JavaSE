package com.zty.蓝桥杯;

import java.math.BigDecimal;
import java.util.Scanner;

//最大最小公倍数  已知一个正整数N，问从1~N中任选出三个数，他们的最小公倍数最大可以为多少。
public class Demo10 {
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long res = 0;
		if(n%2==1){//奇数 n*n-1*n-2
			res = n*(n-1)*(n-2);
		}else{//偶数
			if(n%3==0){//n-1*n-2*n-3
				res = (n-1)*(n-2)*(n-3);
			}else {//n*n-1*n-3
				res = (n) * (n - 1) * (n - 3);
			}
		}
		System.out.println(res);
		scanner.close();
	}
	//使用BigDecimal
	//public static void main(String[]args){
	//	Scanner scanner = new Scanner(System.in);
	//	int n = scanner.nextInt();
	//	BigDecimal res = new BigDecimal(0);
	//	BigDecimal n_ = new BigDecimal(n);
	//	BigDecimal n_1 = new BigDecimal(n-1);
	//	if(n%2==1){//奇数 n*n-1*n-2
	//		res = n_.multiply(n_1);
	//		res = res.multiply(new BigDecimal(n-2));
	//	}else{//偶数
	//		if(n%3==0){//n-1*n-2*n-3
	//			res = n_1.multiply(new BigDecimal(n-2));
	//			res = res.multiply(new BigDecimal(n-3));
	//		}else{//n*n-1*n-3
	//			res = n_.multiply(new BigDecimal(n-1));
	//			res = res.multiply(new BigDecimal(n-3));
	//		}
	//
	//	}
	//	System.out.println(res);
	//	scanner.close();
	//}
}