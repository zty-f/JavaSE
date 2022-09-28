package main.test08;

/**
 * @version V1.0
 * @ClassName: main.test08.Test01.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-28 19:49
 * @Description:
 */
public class Test01 {
    static int x = 1;

    public static void main(String[] args) {
        System.out.println(x);//1
        t(x);
        System.out.println(x);//1
    }

    public static void t(int x){
        x++;
    }
}
