package main.test09;

/**
 * @version V1.0
 * @ClassName: main.test09.Test08.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-10-24 11:12
 * @Description:
 */
public class Test08 {
    public static void main(String[] args) {
        /*
        for (char i = 'A';i < 'H'; i++) {
            System.out.print(i);// ABCDEFG
        }

        for (char i = '1';i < '8'; i++) {
            System.out.print(i);// 1234567
        }
        */
        char x = 'B',y = '4';
        for (char i = x;i <= 'H'; i++) {
            for (char j = y;j <= '8'; j++) {
                if (i==x||j==y||i-j=='A'-'1'){
                    StringBuffer s = new StringBuffer();
                    s.append(i).append(j);
                    System.out.println(s);
                }
            }
        }
    }
}
