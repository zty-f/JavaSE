package main.test08;

/**
 * @version V1.0
 * @ClassName: main.test08.User.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-10-01 11:23
 * @Description:
 */
public class User {
    private int age;
    private int id;
    public String name;

    public User() {
    }

    public User(int age, int id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
