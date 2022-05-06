package main.test02;

/**
 * @version V1.0
 * @ClassName: main.test02.Test03.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-05-06 15:39
 * @Description: 变量赋值
 */
public class Test03 {
    public static void main(String[] args) {
        double d = 5.3e12;
        //float f = 11.1; 错误 不断高转低，小数默认是double类型
        //int i = 1.1;  同上
        //Double oD = 3; Double是包装类型，不能直接赋值


        //equal方法没有重写默认是比较两个对象在内存中的内存值是否相同

        //只有对象才能调用equals方法
    }
}
