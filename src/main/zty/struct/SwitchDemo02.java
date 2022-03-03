/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo02
 * @description:
 * @create: 2022-01-27 20:26
 * @Version 1.0
 **/
package main.zty.struct;

public class SwitchDemo02 {
    public static void main(String[] args) {

        //case具有穿透性质，不加break语句会导致只要满足一个选项
        //就会把这个选项下面的语句都执行
        int x = 1;
        switch (x){
            case 0:
                System.out.println(0);
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
            default:
                System.out.println("default");
                /*
                输出：
                1
                2
                3
                default
                 */
        }
    }
}
