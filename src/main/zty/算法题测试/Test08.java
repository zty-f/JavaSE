/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Test08
 * @description:
 * @create: 2022-02-19 09:53
 * @Version 1.0
 **/
package main.zty.算法题测试;

import java.util.*;

public class Test08 {
    public static void main(String[] args) {
        String a = "eat";
        System.out.println(judge(a,"tan"));
        HashMap<String,List<String>> map = new HashMap<>();
        Set<String> keySet = map.keySet();
        System.out.println(map.values());
    }
    public static boolean judge(String a,String b) {
        char[] a1=a.toCharArray();
        Arrays.sort(a1);
        a=new String(a1);
        char[] b1=b.toCharArray();
        Arrays.sort(b1);
        b=new String(b1);
        return a.equals(b);
    }
}
