package com.api.Reflect;

public class Dog {
    private String name;
    private int age ;
    private String color ;
    public static String school;
    public static final String SCHOOL_1 = "宠物学校";

    public Dog() {
    }

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void run(){System.out.println("狗跑的贼快~~");}
    private void eat(){System.out.println("狗吃骨头");}
    private void eat(String name){System.out.println("狗吃"+name);}
    public static void inAddr(){System.out.println("在吉山区有一只单身狗！");}

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}