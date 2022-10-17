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
    }
}
