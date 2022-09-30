package main.test08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @version V1.0
 * @ClassName: main.test08.Test03.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-30 14:50
 * @Description:
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        List<String> list = new ArrayList<>();
        while (!(s=scanner.nextLine()).equals("")){//多行输入！
            list.add(s);
        }
        System.out.println(list);
        //System.out.println(","+scanner.nextLine()+",");
        scanner.close();


        System.out.println(int.class);
        System.out.println(long.class);
        System.out.println(Integer.class);


        // 同一种类最终只会生成一个一个对应的Class在jvm方法区中（加载类）
        int[] x = new int[10];
        int[] y = new int[1000];
        System.out.println(x.getClass());
        System.out.println(y.getClass()); // x和y两个不同的对象获得的Class是同一个。
        System.out.println(x.getClass().hashCode());
        System.out.println(y.getClass().hashCode());
    }
}
