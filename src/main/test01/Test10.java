package main.test01;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @version V1.0
 * @ClassName: main.test.Test10.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-04-14 09:05
 * @Description: 素数判断
 */
public class Test10 {

    public static int countPrimes(int n) {
        if(n<2) return 0;
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        int cnt  = n-2;//0 1 不是素数
        // 由于因⼦的对称性，其中的 for 循环只需要遍历[2,sqrt(n)]
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (isPrime[i]) {
                // i*2 --> i*i优化 如2的4倍已经被置为false 和 4的2倍还会重新置为false(冗余的计算)
                for (int j = i * i; j < n; j += i) {
                    if(isPrime[j]){
                        isPrime[j] = false;
                        cnt--;
                    }
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        long startTime =System.currentTimeMillis();

        Scanner s = new Scanner(System.in);
        int a;

        a=s.nextInt();

        System.out.println(countPrimes(a));

        System.out.println(System.currentTimeMillis()-startTime);
    }
}
