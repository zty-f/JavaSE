package main.api.Reflect;

import org.junit.Test;

import java.lang.reflect.Field;
/*
Field getField(String name) : 根据成员变量名获得对应 Field 对象，只能获得 public 修饰
Field getDeclaredField(String name) : 根据成员变量名获得对应 Field 对象，所有申明的变量
Field[] getFields() : 获得所有的成员变量对应的Field对象，只能获得 public 的
Field[] getDeclaredFields() : 获得所有的成员变量对应的 Field 对象，只要申明了就可以得到
 */
public class FieldDemo {
    //获取全部成员变量
    @Test
    public void getDeclaredFields(){
        // a.先获取class类对象
        Class c = Dog.class;
        // b.获取全部申明的成员变量对象
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName()+"->"+field.getType());
        }
    }
    //获取某个成员变量
    @Test
    public void getDeclaredField() throws Exception {
        // a.先获取class类对象
        Class c = Dog.class;
        // b.定位某个成员变量对象 :根据名称定位！！
        Field ageF = c.getDeclaredField("age");
        System.out.println(ageF.getName()+"->"+ageF.getType());
    }
}