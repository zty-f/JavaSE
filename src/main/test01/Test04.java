package main.test01;

/**
 * @version V1.0
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022/3/21 14:37
 * @Description:  String测试
 */
public class Test04 {
    public static void main(String[] args) {
        //String lx = "ZTY";
        //String nb = lx;
        //lx = "FMJ";
        //System.out.println(nb); //ZTY

        String zty = new String("ZTY");
        String fmj = zty;
        zty = new String("fmj");
        System.out.println(fmj);//ZTY
    }
}
