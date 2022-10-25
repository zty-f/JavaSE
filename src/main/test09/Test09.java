package main.test09;

/**
 * @version V1.0
 * @ClassName: main.test09.Test09.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-10-24 16:05
 * @Description:
 */
class User{
    private String name;//private属性不能通过 对象.name 获取
    int age; // >private权限可以通过 对象.age 获取

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Test09 {
    public static void main(String[] args) {
        User user = new User();
        //System.out.println(user.name);  // 报错
        System.out.println(user.age);
        System.out.println(user);
    }
}
