package main.test09;

/**
 * @version V1.0
 * @ClassName: main.test09.Test04.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-10-13 20:49
 * @Description:
 */
public class Test04 {
    private static final int a = 0;
    public static void main(String[] args) {
        //System.out.println(a++);//常量不能修改
        byte a = 12;
        byte b = 2;
        System.out.println(a>>b);

        String s = "a"+"b"+"c"+"d";
    }
}
