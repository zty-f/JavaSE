/**
 * @author: zty
 * @program: JavaSE
 * @ClassName ForDemo04
 * @description:
 * @create: 2022-01-27 21:02
 * @Version 1.0
 **/
package main.zty.struct;

public class ForDemo04 {
    public static void main(String[] args) {
        //99乘法口诀表
        System.out.println("----------------------------------------");
        for(int i=1;i<=9;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j+"X"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------");

    }
}
