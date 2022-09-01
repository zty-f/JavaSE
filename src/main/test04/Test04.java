package main.test04;

/**
 * @version V1.0
 * @ClassName: main.test04.Test04.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-01 20:54
 * @Description: 静态变量
 */
public class Test04 {
    private static int i = 0;

    public static void main(String[] args) {
        Test04 t1 = new Test04();
        Test04 t2 = new Test04();// 不同对象公用一个变量，static变量的特性，都在改变同一个值。
        t1.add();
        t2.add();
        Test04.add();
        System.out.println(t1.i+","+t2.i+","+Test04.i); //3,3,3
    }

    public static void add(){
        i++;
    }
}
