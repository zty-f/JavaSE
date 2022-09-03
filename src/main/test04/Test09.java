package main.test04;


/**
 * @version V1.0
 * @ClassName: main.test04.Test09.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-03 16:28
 * @Description: String类测试
 */
public class Test09 {
    public static void main(String[] args) {
        //String s = new String("1"+"2");  // 新增两个String对象

        //String s = "1234"+"4567";  // 新增1个String对象

        /*
        String s1 = "5";  //生成一个String s1
        String s2 = "6";  //生成一个String s2
        String s= s1+s2+new String("7");  //生成3个String  两个567 一个7
        */

        //new String("789");  // 新增1个String对象

        //String s = new String("123456"); // 新增2个String对象

        //String s = "666" + new String("666");  // 新增3个String对象


        String s1 = new String("a") + new String("b");

        String s2 = "ab";

        String s3 = s1.intern();

        System.out.println(s1 == s2); // false
        System.out.println(s1 == s3); // false
        System.out.println(s2 == s3); // true

        new Thread();
    }
}
