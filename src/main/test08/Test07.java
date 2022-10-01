package main.test08;

import java.lang.reflect.Field;

/**
 * @version V1.0
 * @ClassName: main.test08.Test07.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-10-01 11:16
 * @Description: 反射巩固学习
 */
public class Test07 {

    //1.getXXX 获取所有publicXXX
    //2.getDeclaredXXX   获取该类的所有对应的XXX
    public static void main(String[] args) {
        User user = new User();
        Class c = user.getClass();

        Field[] fields = c.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("========================");

        Field[] declaredFields = c.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
    }
}
