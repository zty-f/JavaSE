package main.test07;

/**
 * @version V1.0
 * @ClassName: main.test07.Test10.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-28 12:20
 * @Description:
 */
public class Test10 {
    static String x = "1";
    static int y = 1;
    int a[] = new int[6];
    public static void main(String[] args) {
        int z = 2;
        System.out.println(x+y+z);//112
        System.out.println("1"+3);//13

        //System.out.println(a[0]); 编译错误，a必须为static类型
    }

    final void a(){

    }

    final void a(int  x){ //final方法可以重载，不能重写。

    }
}
