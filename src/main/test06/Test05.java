package main.test06;

/**
 * @version V1.0
 * @ClassName: main.test06.Test05.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-14 20:43
 * @Description: 克隆
 */
class Student{
    String name;

    public Student(String name){
        this.name = name;
    }
}
public class Test05 implements Cloneable{//浅克隆 引用变量公用，其他复制一份
    Student st;

    public static void main(String[] args) throws CloneNotSupportedException {
        Test05 t1 = new Test05();
        Student zty = new Student("zty");
        t1.st = zty;
        Test05 t2 = (Test05) t1.clone();

        System.out.println(t1==t2);//false
        System.out.println(t1.equals(t2));//false
        System.out.println(t1.st == t2.st);//true
        System.out.println(t1.st.equals(t2.st));//true

    }
}
