package main.test06;

/**
 * @version V1.0
 * @ClassName: main.test06.Test04.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-14 15:56
 * @Description: 代码块
 */
class Test04 {
    static int x = 0;
    static int y = 1;
    static int z = 3;

    static Test04 ins = new Test04();//会调用构造方法

    static {
        x++;
    }

    public Test04() {
        x++;
        y++;
        z++;
    }
    public static Test04 getIns(){
        return ins;
    }

    public static void main(String[] args) {
        Test04 test04 = getIns();

        System.out.println(test04.x);
        System.out.println(test04.y);
        System.out.println(test04.z);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}


