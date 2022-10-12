package main.test09;

/**
 * @version V1.0
 * @ClassName: main.test09.Test03.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-10-12 20:22
 * @Description:
 */

class Base{
    Base(){
        System.out.print("test");
    }

    public Integer get(){
        return new Integer(4);
    }
}
public class Test03 extends Base{
    //public Long get(){   // 编译错误，重写返回值不能变小
    //    return new Long(5);
    //}

    private static float a;

    public static void main(String[] args) {
        System.out.println(a);
        new Test03();
        new Base(); //输出testtest  调用两次构造方法

        //this.a   静态方法中不能使用this关键字。
    }

    public void test(){
        float a1 = this.a;
    }
}
