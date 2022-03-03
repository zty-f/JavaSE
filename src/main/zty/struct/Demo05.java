/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo05
 * @description:
 * @create: 2022-01-28 15:21
 * @Version 1.0
 **/
package main.zty.struct;

public class Demo05 {
    public static void main(String[] args) {
        //打印三角形，灵活运用循环结构！
        for (int i = 1; i <= 8; i++) {
            for(int j = 8;j>=i;j--){
                System.out.print("  ");
            }
            for(int j = 1;j<=4*i-3;j++){//通过控制这个调整三角形！
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
