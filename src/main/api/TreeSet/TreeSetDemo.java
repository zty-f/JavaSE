package main.api.TreeSet;

import java.util.*;

public class TreeSetDemo{
    public static void main(String[] args){
        //如果类和集合都带有比较规则，优先使用集合自带的比较规则
        //Set<Student> students = new TreeSet<>(new Comparator<Student>(){
        //    @Override
        //    public int compare(Student o1, Student o2) {
        //        // o1比较者   o2被比较者
        //        return o2.getAge() - o1.getAge();//降序
        //    }
        //});

        // lambda表达式，等同于上面代码！
        Set<Student> students = new TreeSet<>((s1,s2)->s2.getAge()-s1.getAge()); //构造方法里面添加构造器会覆盖Student类里面的CompareTo方法，两处任意选择一处实现Comparable方法即可！
        //Set<Student> students = new TreeSet<>();

        Student s1 = new Student("a", 10);
        Student s2 = new Student("b", 18);
        Student s3 = new Student("c", 14);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        System.out.println(Arrays.toString(students.toArray()));//按照年龄比较 升序
    }
}