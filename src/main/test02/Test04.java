package main.test02;

/**
 * @version V1.0
 * @ClassName: main.test02.Test04.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-05-08 10:37
 * @Description: Integer测试
 */
public class Test04 {
    public static void main(String[] args) {
        //Integer有缓存池  -128~127  可以通过反射调节
        Integer a = 12;
        Integer b = 12;//会调用 调⽤Integer.valueOf(12)。而从Integer的valueOf()源码可以看到，这里的实现并不是简单的new Integer，而是用IntegerCache做一个cache。
        System.out.println(a==b);//true
        Integer c = 999;
        Integer d = 999;
        System.out.println(c==d);//false
        Integer e = -12;
        Integer f = -12;
        System.out.println(e==f);//true
    }
}
