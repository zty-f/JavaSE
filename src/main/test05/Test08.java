package main.test05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @version V1.0
 * @ClassName: main.test05.Test08.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-09 18:33
 * @Description: 泛型测试
 */
public class Test08 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("1");
        list.add(2);
        list.add(2.4);

        //double res = (Integer)list.get(1)+(Integer) list.get(2); //类型转换报错

        Integer i = new Integer(1);
        double x = i;
        System.out.println(x); //Integer可以转换为double

        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j).getClass());
            //class java.lang.String
            //class java.lang.Integer
            //class java.lang.Double
        }

        new HashMap<>();
        method();
    }

    // final可以修饰静态方法！
    public final static void method(){
        //int i = 1/0; // java.lang.ArithmeticException 异常
        System.out.println(11111);
    }
}
