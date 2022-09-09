package main.test05;

import java.util.ArrayList;
import java.util.List;

/**
 * @version V1.0
 * @ClassName: main.test05.Test07.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-09 18:28
 * @Description: 泛型
 */
public class Test07 {
    public static void main(String[] args) {
        List list = new ArrayList<Integer>();

        list.add("s");
        list.add("a");
        list.add('x');//能够正常使用添加
        System.out.println(list.get(0));//s
        System.out.println(list.get(1));//a
        System.out.println(list.get(2));//x
    }
}
