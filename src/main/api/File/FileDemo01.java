/**
 * @author: zty
 * @program: JavaSE
 * @ClassName FileDemo01
 * @description:
 * @create: 2022-02-13 21:10
 * @Version 1.0
 **/
package main.api.File;

import java.io.File;
/*
File f = new File("绝对路径/相对路径");
绝对路径：从磁盘的的盘符一路走到目的位置的路径。
    绝对路径依赖具体的环境，一旦脱离环境，代码可能出错
    一般是定位某个操作系统中的某个文件对象
相对路径：不带盘符的（重点）
    默认是直接相对到工程目录下寻找文件的。
    相对路径只能用于寻找工程下的文件，可以跨平台
File f = new File("文件对象/文件夹对象") 广义来说：文件是包含文件和文件夹的
 */
public class FileDemo01 {
    public static void main(String[] args) {
        // 1.创建文件对象：使用绝对路径
        // 文件路径分隔符：
        //      -- a.使用正斜杠： /
        //      -- b.使用反斜杠： \\
        //      -- c.使用分隔符API:File.separator
        //File f1 = new File("D:"+File.separator+"it"+File.separator
        //+"图片资源"+File.separator+"beautiful.jpg");
        File f1 = new File("D:\\IDEA_Project\\JavaSE\\src\\com\\api\\File\\zty.txt");
        System.out.println(f1.length()); // 获取文件的大小，字节大小

        // 2.创建文件对象：使用相对路径
        File f2 = new File("src/com/api/File/fmj.txt");
        System.out.println(f2.length());

        // 3.创建文件对象：代表文件夹。
        File f3 = new File("D:\\IDEA_Project\\JavaSE\\src\\com\\api\\File");
        System.out.println(f3.exists());// 判断路径是否存在！！

        File f4 = new File("D:\\IDEA_Project\\JavaSE\\src\\com\\api\\File\\test");
        f4.mkdir();
        System.out.println(f4.exists());// 判断路径是否存在！！
    }
}
