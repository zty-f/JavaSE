package main.test02;

/**
 * @version V1.0
 * @ClassName: main.test02.Test11.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-05-17 19:59
 * @Description: 自动类型转换测试
 */
public class Test11 {
    public static void main(String[] args) {
        int a = 1;
        char b = '2';
        double d = 3;
        System.out.println(a+b);//char+int = int类型
        System.out.println(a+b+d);//int +char + double = double类型
    }
}
