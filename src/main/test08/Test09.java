package main.test08;

import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 * @version V1.0
 * @ClassName: main.test08.Test09.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-10-01 14:25
 * @Description: 注解实现orm 对象关系映射
 */
public class Test09 {
    public static void main(String[] args) throws NoSuchFieldException {
        Class c = Student.class;

        // 通过反射获得注解
        Annotation[] annotations = c.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        // 获得指定注解的value的值
        Table table = (Table) c.getAnnotation(Table.class);
        System.out.println(table.value());

        // 获得类指定属性上的注解
        Field name = c.getDeclaredField("name");
        Annotation[] nameAnnotations = name.getAnnotations();//获取所有注解
        Filed filed = name.getAnnotation(Filed.class); // 获取指定注解

        System.out.println(filed.columnName()+";"+filed.type()+";"+filed.length());

    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Table{
    String value();
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Filed{
    String columnName();
    String type();
    int length();
}

@Table("db_student")
class Student {
    @Filed(columnName = "db_id",type = "int",length = 10)
    private int id;
    @Filed(columnName = "db_age",type = "int",length = 10)
    private int age;
    @Filed(columnName = "db_name",type = "varchar",length = 3)
    private String name;

    public Student() {
    }

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}