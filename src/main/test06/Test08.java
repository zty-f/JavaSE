package main.test06;

/**
 * @version V1.0
 * @ClassName: main.test06.Test08.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-19 20:33
 * @Description:
 */
public class Test08 {
    public static void main(String[] args) {
        StringBuffer A = new StringBuffer("A");
        StringBuffer B = new StringBuffer("B");
        change(A,B);
        System.out.println(A+","+B);//AB,B
    }

    public static void change(StringBuffer x,StringBuffer y){
        x.append(y);
        y = x;
    }
}
