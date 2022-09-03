package main.test04;

/**
 * @version V1.0
 * @ClassName: main.test04.Test08.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-03 14:58
 * @Description: 命名规范测试
 */
public class Test08 {

    public static void main(String[] args) {
        a();
    }


    public static void a(){
        int a = 0; // 可以和方法名重复
        System.out.println(a);

        String x = "12";

        System.out.println(Integer.parseInt(x)); // 返回int基本数据类型

        System.out.println(Integer.valueOf(x).intValue()); // 返回int基本数据类型

    }
}
