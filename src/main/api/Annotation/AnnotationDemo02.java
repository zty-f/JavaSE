package main.api.Annotation;


/*
注解的特殊属性名称：value

如果只有一个 value 属性的情况下，使用 value 属性的时候可以省略 value 名称不写
如果有多个属性，且多个属性没有默认值，那么 value 是不能省略的
 */
//@Book("/deleteBook.action")
@Books(value = "/deleteBook.action" , age = 12)
public class AnnotationDemo02{
}

@interface Books{
    String value();
    int age() default 10;
}