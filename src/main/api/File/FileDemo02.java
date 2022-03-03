/**
 * @author: zty
 * @program: JavaSE
 * @ClassName FileDemo02
 * @description:
 * @create: 2022-02-14 16:09
 * @Version 1.0
 **/
package main.api.File;

import java.io.File;
//常用api
public class FileDemo02 {
    public static void main(String[] args) {
        // 1.绝对路径创建一个文件对象
        File f1 = new File("D:\\IDEA_Project\\JavaSE\\src\\com\\api\\File\\zty.jpg");
        // a.获取它的绝对路径。
        System.out.println(f1.getAbsolutePath());
        // b.获取文件定义的时候使用的路径。
        System.out.println(f1.getPath());
        // c.获取文件的名称：带后缀。
        System.out.println(f1.getName());
        // d.获取文件的大小：字节个数。
        System.out.println(f1.length());
        System.out.println("------------------------");

        // 2.相对路径
        File f2 = new File("src/com/api/File/zty.txt");
        // a.获取它的绝对路径。
        System.out.println(f2.getAbsolutePath());
        // b.获取文件定义的时候使用的路径。
        System.out.println(f2.getPath());
        // c.获取文件的名称：带后缀。
        System.out.println(f2.getName());
        // d.获取文件的大小：字节个数。
        System.out.println(f2.length());

        // c.判断文件对象是否是文件夹,是文件夹返回true ,反之
        System.out.println(f2.isDirectory()); // false
    }
}
