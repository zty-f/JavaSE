/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Test10
 * @description:
 * @create: 2022-02-22 10:23
 * @Version 1.0
 **/
package main.zty.算法题测试;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test10 {
    public static void main(String[] args) {
        List<int[]> res = new ArrayList<>();
        res.add(new int[]{1,2});
        res.add(new int[]{1,2});
        res.add(new int[]{1,2});
        int [] tmp = new int[]{2,2};
        tmp = null;
        if(tmp==null){
            System.out.println("yes");
        }
        int[][] x = res.toArray(new int[0][0]);
        for (int i = 0; i < x.length; i++) {
            System.out.println(Arrays.toString(x[i]));
        }
        System.out.println(x);
        String s = "ddldl";
        System.out.println(s.startsWith("dd"));
    }
}
