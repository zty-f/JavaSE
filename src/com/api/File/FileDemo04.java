/**
 * @author: zty
 * @program: JavaSE
 * @ClassName FileDemo04
 * @description:
 * @create: 2022-02-14 16:30
 * @Version 1.0
 **/
package com.api.File;

import java.io.File;
import java.text.SimpleDateFormat;
// 目录相关操作！
public class FileDemo04 {
    public static void main(String[] args) {
        File dir = new File("D:\\IDEA_Project\\JavaSE\\src\\com\\api\\File");
        // a.获取当前目录对象下的全部一级文件名称到一个字符串数组返回。
        String[] names = dir.list();
        for (String name : names) {
            System.out.println(name);
        }
        // b.获取当前目录对象下的全部一级文件对象到一个File类型的数组返回。
        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }

        // c
        File f1 = new File("D:\\IDEA_Project\\JavaSE\\src\\com\\api\\File\\zty.txt");
        long time = f1.lastModified(); // 最后修改时间！
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(time));
    }
}
