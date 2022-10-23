package main.test09;

/**
 * @version V1.0
 * @ClassName: main.test09.Test07.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-10-23 16:23
 * @Description:
 */
public class Test07 {
    public int a(){
        //static int  i = 0; //局部变量不能为static修饰
        int i = 0;
        i++;
        return i;
    }
    public static void main(String[] args) {
        //this.a();  静态方法不能使用this super关键字

        Test07 test07 = new Test07();
        test07.a();
        System.out.println(test07.a());
    }

    public void b(){
        this.a();
        super.hashCode();
    }
}
