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
    }
}
