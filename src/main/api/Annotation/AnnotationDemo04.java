/**
 * @author: zty
 * @program: JavaSE
 * @ClassName AnnotationDemo04
 * @description:
 * @create: 2022-02-16 17:22
 * @Version 1.0
 **/
package main.api.Annotation;

import org.junit.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.Arrays;
/*
注解在哪个成分上，就先拿哪个成分对象，比如注解作用在类上，则要该类的 Class 对象，再来拿上面的注解
 */
public class AnnotationDemo04{
    @Test
    public void parseClass() {
        // 1.定位Class类对象
        Class c = BookStore.class;
        // 2.判断这个类上是否使用了某个注解
        if(c.isAnnotationPresent(Book.class)){
            // 3.获取这个注解对象
            Book b = (Book)c.getDeclaredAnnotation(Book.class);
            System.out.println(b.value());
            System.out.println(b.price());
            System.out.println(Arrays.toString(b.authors()));
        }
    }
    @Test
    public void parseMethod() throws Exception {
        Class c = BookStore.class;
        Method run = c.getDeclaredMethod("run");
        if(run.isAnnotationPresent(Book.class)){
            Book b = (Book)run.getDeclaredAnnotation(Book.class);
            System.out.println(b.value());
            System.out.println(b.price());
            System.out.println(Arrays.toString(b.authors()));
        }
    }
}

@Book(value = "《Java基础到精通》", price = 99.5, authors = {"波仔","波妞"})
class BookStore{
    @Book(value = "《Mybatis持久层框架》", price = 199.5, authors = {"dlei","播客"})
    public void run(){
    }
}
@Target({ElementType.TYPE,ElementType.METHOD}) // 类和成员方法上使用
@Retention(RetentionPolicy.RUNTIME) // 注解永久存活
@interface Book{
    String value();
    double price() default 100;
    String[] authors();
}