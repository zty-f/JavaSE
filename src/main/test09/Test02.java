package main.test09;

/**
 * @version V1.0
 * @ClassName: main.test09.Test02.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-10-11 11:34
 * @Description:
 */
public class Test02 {
    public static void main(String[] args) {
        int i = 0,s = 0;
        do {
            if(i%2==0){
                i++;
                continue; //每次continue都会判断异常while里面的条件是否符合
            }
            i++;
            s = s+i;
        }while (i<6);
        System.out.println(s);//12

        switch (1){  //具有穿透性
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(1);
            case 3:
                System.out.println(1);
            case 4:
                System.out.println(1);
            default:
                System.out.println("default");
        }
    }
}
