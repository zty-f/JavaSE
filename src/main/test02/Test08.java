package main.test02;

/**
 * @version V1.0
 * @ClassName: main.test02.Test08.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-05-09 15:26
 * @Description: Math类测试
 */
public class Test08 {
    /*
    floor: 求小于参数的最大整数。返回double类型-----n. 地板，地面
         例如：Math.floor(-4.2) = -5.0
    -----------------------------------------------------------
    ceil:   求大于参数的最小整数。返回double类型-----vt. 装天花板；
         例如：Math.ceil(5.6) = 6.0
    -----------------------------------------------------------
    round: 对小数进行四舍五入后的结果。返回int类型
         例如：Math.round(-4.6) = -5
     */
    public static void main(String[] args) {
        System.out.println(Math.floor(-4.2)); //-5.0  向下取整
        System.out.println(Math.ceil(4.2)); //5.0  向上取整
        System.out.println(Math.rint(4.6)); //5.0  返回最接近该值的那个整数。  返回double类型
        System.out.println(Math.round(4.2)); //4.0  四舍五入    返回long类型
        System.out.println(Math.abs(-2.5)); //2.5  绝对值
        System.out.println(Math.log(Math.E)); //lne = 1  对数e为底
        System.out.println(Math.log10(100)); //lg100 = 2  对数10为底
    }

}
