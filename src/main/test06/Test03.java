package main.test06;

/**
 * @version V1.0
 * @ClassName: main.test06.Test03.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-14 15:52
 * @Description: 静态变量
 */
public class Test03 {

    public int test(){
        //static int x = 0;  //static不能修饰局部变量！！！！！！！
        int x=0;
        x++;
        return x;
    }

    public static void main(String[] args) {
        Test03 test03 = new Test03();

        test03.test();

        System.out.println(test03.test());//1
    }
}
