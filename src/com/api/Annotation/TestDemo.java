package com.api.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
/*
注解模拟
注解模拟写一个 Junit 框架的基本使用

定义一个自定义注解 MyTest，只能注解方法，存活范围一直都在。
定义若干个方法，只要有 @MyTest 注解的方法就能被触发执行，没有这个注解的方法不能执行！！
 */
public class TestDemo{
    @MyTests
    public void test01(){System.out.println("===test01===");}
    public void test02(){System.out.println("===test02===");}
    @MyTests
    public void test03(){System.out.println("===test03===");}
    @MyTests
    public void test04(){System.out.println("===test04===");}
    
    public static void main(String[] args) throws Exception {
        TestDemo t = new TestDemo();
        Class c = TestDemo.class;
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            if(method.isAnnotationPresent(MyTests.class)){
                method.invoke(t);
            }
        }
    }
}

@Target(ElementType.METHOD) // 只能注解方法！
@Retention(RetentionPolicy.RUNTIME) // 一直都活着
@interface MyTests{
}