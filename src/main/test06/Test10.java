package main.test06;

import java.util.Random;

/**
 * @version V1.0
 * @ClassName: main.test06.Test10.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-19 21:35
 * @Description: 随机数
 */
public class Test10 {
    /*

     * 生成[min, max]之间的随机整数

     * @param min 最小整数

     * @param max 最大整数

       nextInt(x)  生成0-x之间的随机数，不包含x
     */
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.print(randomInt(2,5)+",");
        }

    }

    private static int randomInt(int min, int max){

        return new Random().nextInt(max-min+1) + min;

    }
}
