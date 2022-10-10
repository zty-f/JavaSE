package main.test08;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @version V1.0
 * @ClassName: main.test08.Test07.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-10-01 11:16
 * @Description: 反射巩固学习
 */
public class Test07 {

    /*
在运行时判断任意一个对象所属的类
在运行时构造任意一个类的对象
在运行时判断任意一个类所具有的成员变量和方法
在运行时获取泛型信息
在运行时调用任意一个对象的成员变量和方法
在运行时处理注解
生成动态代理
     */

    //1.getXXX 获取当前类或父类或父接口的 public 修饰的字段；包含接口中 default 修饰的方法 (JDK1.8)。
    //2.getDeclaredXXX   获取当前类的所有方法；包括 protected/默认/private 修饰的方法；不包括父类 、接口 public 修饰的方法。
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
        System.out.println("============================");
        for (Method method : c.getMethods()) {
            System.out.println(method);
        }
        System.out.println("==============================");
        for (Method method : c.getDeclaredMethods()) {
            System.out.println(method);
        }
    }
}
