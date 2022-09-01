package main.test04;

/**
 * @version V1.0
 * @ClassName: main.test04.Test02.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-01 18:48
 * @Description:  成员变量
 */
public class Test02 {
    Integer i;
    int x;

    public static void main(String[] args) {
        Test02 test02 = new Test02();

        System.out.println(test02.x);
        System.out.println(test02.i);//直接使用会空指针异常，因为对象默认值都是null
    }
}
