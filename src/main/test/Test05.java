package main.test;

/**
 * @version V1.0
 * @ClassName: main.test.Test05.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-03-31 15:21
 * @Description: Integer类测试
 */

//通过设置JVM参数java.lang.Integer.IntegerCache.high 来自定义Integer缓存范围
public class Test05 {
    public static void main(String[] args) {
        Integer a =  new Integer(127); //每次都是新的对象
        Integer b = Integer.valueOf(127);
        Integer c = Integer.valueOf(127); //获取缓存 默认范围-128~127
        Integer d = Integer.valueOf(128);
        Integer e = Integer.valueOf(128);
        Integer f = 127;   //直接 = 相当于使用Integer.valueOf()方法
        Integer f1 = 127;
        Integer g = 128;
        Integer h = 128;
        System.out.println(a == b); //输出false
        System.out.println(b == c); //输出true
        System.out.println(d == e); //输出false
        System.out.println(a == f); //false
        System.out.println(b == f); //true
        System.out.println(f1 == f); //true
        System.out.println(g == h); //false
        System.out.println(g == d); //false
    }
}
