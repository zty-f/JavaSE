package main.test;

import java.util.Arrays;

/**
 * @version V1.0
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022/3/18 9:17
 * @Description:  二维数组排序
 */
public class Test03 {
    public static void main(String[] args) {
        int[][] x = new int[][]{{1,2},{4,5},{3,1},{2,4},{2,2}};
        //按照第一个元素降序排列，相同按照第二个元素升序排列
        Arrays.sort(x,(a,b)->a[0]!=b[0]?b[0]-a[0]:a[1]-b[1]);
        for(int[] t:x){
            System.out.println(Arrays.toString(t));
        }
    }
}
