package com.api.Commons;

import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
//需导入org.apache.commons.io包才能使用下面1,2,3工具类
public class CommonsIODemo01 {
    public static void main(String[] args) throws Exception {
        /*// 1.完成文件复制！
        IOUtils.copy(new FileInputStream("Day13Demo/src/books.xml"),
                     new FileOutputStream("Day13Demo/new.xml"));
        // 2.完成文件复制到某个文件夹下！
        FileUtils.copyFileToDirectory(new File("Day13Demo/src/books.xml"),
                                      new File("D:/it"));
        // 3.完成文件夹复制到某个文件夹下！
        FileUtils.copyDirectoryToDirectory(new File("D:\\it\\图片服务器") ,
                                           new File("D:\\"));*/

        //  Java从1.7开始提供了一些nio, 自己也有一行代码完成复制的技术。
        Files.copy(Paths.get("src/com/api/Commons/src.jpg")
                , new FileOutputStream("src/com/api/Commons/copy.jpg"));
    }
}