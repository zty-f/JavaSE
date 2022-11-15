package main.test10;

/**
 * @version V1.0
 * @ClassName: main.test10.Test03.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-11-10 10:33
 * @Description:
 */

interface A{
     void a();
}

public class Test03 implements A{
    @Override
    public void a() {

    }

    //@Override
    //protected void a() {  //重写方法不能降低访问权限
    //
    //}
    public static void main(String[] args) {
        int i = 0;
        i = i++ + i;
        System.out.println(i); // 1
    }
}
