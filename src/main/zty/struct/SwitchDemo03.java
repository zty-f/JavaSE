/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo03
 * @description:
 * @create: 2022-01-27 20:41
 * @Version 1.0
 **/
package main.zty.struct;

public class SwitchDemo03 {
    public static void main(String[] args) {
        String name = "张天泳";
        //JDK7新特性，switch表达式支持字符串
        //字符串本质还是数字

        // 反编译 java---》class（字节码文件）----》反编译（IDEA）---》Java文件

        // IDEA项目的out目录里面的就是idea反编译class文件所得！
        /*
         String name = "张天泳";
        byte var3 = -1;
        switch(name.hashCode()) {
        case 20953866:
            if (name.equals("冯梦洁")) {
                var3 = 1;
            }
            break;
        case 24137738:
            if (name.equals("张天泳")) {
                var3 = 0;
            }
        }

        switch(var3) {
        case 0:
            System.out.println("张天泳");
            break;
        case 1:
            System.out.println("冯梦洁");
            break;
        default:
            System.out.println("查无此人！");
        }
         */
        switch(name){
            case "张天泳":
                System.out.println("张天泳");
                break;
            case "冯梦洁":
                System.out.println("冯梦洁");
                break;
            default:
                System.out.println("查无此人！");
        }
    }
}
