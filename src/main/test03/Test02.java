package main.test03;

/**
 * @version V1.0
 * @ClassName: main.test03.Test02.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-05-24 11:10
 * @Description: String测试
 */
public class Test02 {
    public static void main(String[] args) {
        T t = new T("qqq");
        String x = "aaa";
        x = "bbb";//改变原x
        System.out.println("111:"+x);//bbb
        change(x);
        changeT(t);
        System.out.println("chnage后："+x);//bbb
        System.out.println("chnageT后："+t.s);//www
    }

    public static void change(String x){//不会改变原string
        x = "zzzz";
        System.out.println(x);
    }

    public static void changeT(T x){//会改变原对象中的string
        x.s = "www";
        System.out.println(x.s);
    }
}
class T{
    String s;
    public T(String s){
        this.s = s;
    }
}