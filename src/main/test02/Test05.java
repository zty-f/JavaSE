package main.test02;


/**
 * @version V1.0
 * @ClassName: main.test02.Test05.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-05-08 10:45
 * @Description: 对象交换输出测试
 */
//打印结果如下
/*
X:xiaoli
Y:xiaoming
xiaoming:xiaoming
xiaoli:xiaoli
 */

public class Test05 {
    public static void main(String[] args) {
        People xiaoming = new People("xiaoming",18);
        People xiaoli = new People("xiaoli",18);
        swap(xiaoming,xiaoli);
        System.out.println("xiaoming:"+xiaoming.getName());
        System.out.println("xiaoli:"+xiaoli.getName());
    }
    public static void swap(People x,People y){//传入的只是引用副本，交换不会对原引用产生变化，可以通过set方法改变对象实体值
        People temp = x;
        x = y;
        y = temp;
        System.out.println("X:"+x.getName());
        System.out.println("Y:"+y.getName());
    }
}
class People{
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
