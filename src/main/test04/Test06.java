package main.test04;

/**
 * @version V1.0
 * @ClassName: main.test04.Test06.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-01 21:05
 * @Description: 值传递是否修改原数据
 */
public class Test06 {

    public static void main(String[] args) {
        int a = 1;
        String s = "123";
        int[] x = new int[]{1,2,3};
        change1(a);
        change2(s);
        change3(x);//数组传递会改变原数组  虽然是值传递，但是传递的是地址值

        new Test06().change4(x);
        System.out.println(a+"--"+s+"--"+x[0]+"--"+x[1]);
    }

    public static void change1(int a){
        a = 2;
    }

    public static void change2(String s){
        s += "4";
    }

    public static void change3(int[] a){
        a[0] = 99;
    }

    public  void change4(int[] a){
        a[1] = 999;
    }

}
