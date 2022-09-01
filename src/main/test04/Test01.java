package main.test04;

/**
 * @version V1.0
 * @ClassName: main.test04.Test01.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-01 16:08
 * @Description: 成员方法和构造方法测试
 */
class Test01 {
    String name;
    int age;

    public Test01(){};

    public Test01(String name,int age){
        name = name;
        this.age = age;
    }


    public void m(){
        Test01 test01 = new Test01("小张", 12);

        System.out.println(test01.name+"==="+test01.age);

        System.out.println(name);
        System.out.println(age);

        System.out.println(this.age);
        System.out.println(this.name);
    }
}

class Main{
    public static void main(String[] args) {
        new Test01().m();
        System.out.println('a'+0); // 97
        System.out.println(-5&6);//将负数的补码（先取反，再加一）和正数进行于运算
        System.out.println(-8&5);
        System.out.println(-8&-5); // -8  补码进行运算
    }
}
