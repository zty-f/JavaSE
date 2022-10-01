package main.test08;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @version V1.0
 * @ClassName: main.test08.Test08.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-10-01 11:27
 * @Description: 反射创建对象
 */
public class Test08 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        User user = new User();
        Class c = user.getClass();

        // 1.本质是调用无参构造进行创建
        User u = (User) c.newInstance();

        System.out.println(u);
        System.out.println("============================");

        // 2. 通过构造器创建对象
        Constructor constructor = c.getDeclaredConstructor(int.class, int.class, String.class);

        User zty = (User) constructor.newInstance(1, 2, "zty");

        System.out.println(zty);

        System.out.println("=============================");

        // 3.通过反射调用方法

        Method setName = c.getDeclaredMethod("setName", String.class);
        setName.invoke(zty,"fmj");//参数一：调用方法的对象 参数二：传入方法的参数
        System.out.println(zty);
        System.out.println("=================================");

        // 4.通过反射操作属性
        Field age = c.getDeclaredField("age");
        age.setAccessible(true);//破坏私有，可以修改private属性（关闭程序对于该属性的安全检查）
        age.set(zty,18);
        System.out.println(zty);


    }
}
