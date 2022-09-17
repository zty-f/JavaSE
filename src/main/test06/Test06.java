package main.test06;

import java.util.Arrays;

/**
 * @version V1.0
 * @ClassName: main.test06.Test06.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-16 09:45
 * @Description:
 */
public class Test06 {

    public Test06(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {

        String s;
        //System.out.println(s);  //编译错误，要使用局部变量必须初始化

        String x = "abcdefghijk";

        System.out.println(x.substring(4,7));//efg

        test();

        try {
            return;
        }finally {
            System.out.println("finally");
        }

        //Test06 test06 = new Test06(); // 编译异常，如果有一个带参数构造方法，要使用无参构造方法必须显示声明

    }

    public static void test(){
        int[] x = {1,2,3,4};
        System.out.println(Arrays.toString(x));
    }
}

//protected interface a{  // 接口的修饰符只有public
//
//}