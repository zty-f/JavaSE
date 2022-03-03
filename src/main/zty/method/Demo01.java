/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo01
 * @description:
 * @create: 2022-01-28 15:51
 * @Version 1.0
 **/
package main.zty.method;

public class Demo01 {
    public static void main(String[] args) {
        //通过命令行先javac编译然后java运行
        /*
        注意：
        不能在src/com/zty/method目录运行Demo01.class文件,会报错：错误: 找不到或无法加载主类 Demo01
        必须在src目录下执行包下面的Demo01.class文件，例如：java com.zty.method.Demo01
         */
        for (int i = 0; i < args.length; ++i) {
            System.out.println("args[" + i + "]:" + args[i]);
        }
    }
}
