package main.api.Reflect;

import org.junit.Test;

import java.lang.reflect.Method;
/*
Method getMethod(String name,Class...args)：根据方法名和参数类型获得方法对象，public 修饰
Method getDeclaredMethod(String name,Class...args)：根据方法名和参数类型获得方法对象，包括 private
Method[] getMethods()：获得类中的所有成员方法对象返回数组，只能获得 public 修饰且包含父类的
Method[] getDeclaredMethods()：获得类中的所有成员方法对象，返回数组，只获得本类申明的方法

public Object invoke(Object obj, Object... args)：使用指定的参数调用由此方法对象，obj 对象名
 */
public class MethodDemo{
    //获得类中的所有成员方法对象
    @Test
    public void getDeclaredMethods01(){
        // a.先获取class类对象
        Class c = Dog.class ;
        // b.获取全部申明的方法!
        Method[] methods = c.getDeclaredMethods();
        // c.遍历这些方法
        for (Method method : methods) {
            System.out.println(method.getName()+"->"
                    + method.getParameterCount()+"->" + method.getReturnType());
        }
    }
    @Test
    public void getDeclaredMethods02() throws Exception {
        Class c = Dog.class;
        Method run = c.getDeclaredMethod("run");
        // c.触发方法执行!
        Dog d = new Dog();
        Object o = run.invoke(d);
        System.out.println(o);// 如果方法没有返回值，结果是null
        
		//参数一：方法名称   参数二：方法的参数个数和类型(可变参数！)
        Method eat = c.getDeclaredMethod("eat",String.class);
        eat.setAccessible(true); // 暴力反射！
        
       	//参数一：被触发方法所在的对象  参数二：方法需要的入参值
        Object o1 = eat.invoke(d,"肉");
        System.out.println(o1);// 如果方法没有返回值，结果是null
    }
}