package main.api.File;

import java.io.File;
import java.io.IOException;
//创建删除
public class FileDemo03 {
    public static void main(String[] args) throws IOException {
        File f = new File("src/com/api/File/create.txt");
        // a.创建新文件，创建成功返回true ,反之
        System.out.println(f.createNewFile());

        // b.删除文件或者空文件夹
        //System.out.println(f.delete());
        // 不能删除非空文件夹，只能删除空文件夹
        File f1 = new File("src/com/api/File");
        System.out.println(f1.delete());

        // c.创建一级目录
        File f2 = new File("src/com/api/File/test/first");
        System.out.println(f2.mkdir());

        // d.创建多级目录
        File f3 = new File("src/com/api/File/a/b/c/d");
        System.out.println(f3.mkdirs());
    }
}