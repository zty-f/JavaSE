package main.test05;

/**
 * @version V1.0
 * @ClassName: main.test05.Test02.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-05 20:59
 * @Description: string测试
 */
public class Test02 {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = new String(s1);
        String s3 = s2.intern();

        System.out.println(s1 == s2); // false

        System.out.println(s1 == s3);// true

        System.out.println(s2 == s3);// false
    }
}
