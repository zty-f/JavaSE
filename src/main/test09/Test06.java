package main.test09;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @version V1.0
 * @ClassName: main.test09.Test06.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-10-17 21:00
 * @Description:
 */
public class Test06 {
    public static void main(String[] args) {
        AtomicInteger a = new AtomicInteger();
        System.out.println(a);
        a.getAndIncrement(); //并发安全的加一  底层采用CAS
        System.out.println(a);
        char x = 'x';
        char y = 'y';
        char z;
        int d = 1;
        x += d;  //!!!!!!!这样可以   但是不能写成x = x+d;
        System.out.println(x);
        //z = x+y;  编译错误  x+y所得结果为int ，需要强制转换为char
    }
}
