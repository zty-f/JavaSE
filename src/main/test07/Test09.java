package main.test07;

/**
 * @version V1.0
 * @ClassName: main.test07.Test09.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-27 19:43
 * @Description:
 */
class K{
    private String type;

    public K(String x){
        type = x;
    }

    public String getType() {
        return type;
    }
}

public class Test09 {
    public static void main(String[] args) {
        int x = 10,y = 11;
        K a = new K("a");
        K b = new K("b");
        a(x,y);
        b(a,b);
        System.out.println(x+","+y);
        System.out.println(a.getType()+","+b.getType());
    }

    public static void b(K a,K b){
        K t = a;
        a = b;
        b = t;
    }

    public static void a(Integer a,Integer b){
        int tmp = a;
        a = b;
        b = tmp;
    }
}
