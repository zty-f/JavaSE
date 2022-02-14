package com.api.IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo01 {
    public static void main(String[] args) throws Exception {
        // 1.创建文件对象定位zty.txt
        File file = new File("D:\\IDEA_Project\\JavaSE\\src\\com\\api\\File\\zty.txt");
        // 2.创建一个字节输入流管道与源文件接通
        InputStream is = new FileInputStream(file);
        // 3.读取一个字节的编号返回，读取完毕返回-1
		//int code1 = is.read(); // 读取一滴水，一个字节
		//System.out.println((char)code1);

        // 4.使用while读取字节数
        // 定义一个整数变量存储字节
        int ch = 0 ;
        while((ch = is.read())!= -1){
            System.out.print((char) ch);
        }
        /*
        一个一个字节读取英文和数字没有问题。
        但是一旦读取中文输出无法避免乱码，因为会截断中文的字节。
        一个一个字节的读取数据，性能也较差，所以禁止使用上面的方案
         */
    }
}