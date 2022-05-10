package main.test02;

/**
 * @version V1.0
 * @ClassName: main.test02.Test09.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-05-10 15:00
 * @Description: Integer类方法测试
 */
public class Test09 {
    public static void main(String[] args) {
        System.out.println(Integer.parseInt("1024"));//返回int类型
        System.out.println(Integer.valueOf("1024"));//返回Integer类型
        System.out.println(Integer.valueOf("1024").intValue());//返回int类型
        Integer x = 2;
        System.out.println(x.intValue());//返回int类型
    }
}
