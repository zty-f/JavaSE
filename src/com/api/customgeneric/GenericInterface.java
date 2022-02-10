/**
 * @author: zty
 * @program: JavaSE
 * @ClassName GenericInterface
 * @description:
 * @create: 2022-02-10 20:32
 * @Version 1.0
 **/
package com.api.customgeneric;

public class GenericInterface {
    public static void main(String[] args) {
        Data<Student> d = new StudentData();
        d.add(new Student());
    }
}

//自定义泛型接口
interface Data<E>{
    void add(E e);
    void delete(E e);
    void update(E e);
    E query(int index);
}
class Student{

}
class StudentData implements Data<Student>{

    @Override
    public void add(Student student) {

    }

    @Override
    public void delete(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public Student query(int index) {
        return null;
    }
}