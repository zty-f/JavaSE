package com.api.Reflect;

public class Student {
    private String name ;
    private int age ;
    public Student(){
        System.out.println("无参数构造器被执行~~~~");
    }

    private Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        System.out.println("有参数构造器被执行~~~~");
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}