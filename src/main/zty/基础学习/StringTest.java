package main.zty.基础学习;

/**
 * @version V1.0
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022/3/14 19:05
 * @Description:
 */
/*
String s = "zty"  常量池中存在直接获取，没有则先在常量池中先创建再返回
String s = new String("zty") 常量池中存在则直接在堆中创建然后返回引用，常量池中不存在则先在编译时期在常量池中创建
                                ，然后再在堆中创建一个对象。
 */
public class StringTest {
    public static void main(String[] args) {
        String s = new String("zty");
        System.out.println(inPool("zty"));
    }
    //判断是否在常量池中
    public static boolean inPool(String s) {
        String s2 = s.intern();
        if (s2 == s)
            return true;
        return false;
    }
}
