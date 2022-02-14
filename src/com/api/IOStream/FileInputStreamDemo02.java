package com.api.IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo02 {
    public static void main(String[] args) throws Exception {
        //简化写法，底层实质上创建了File对象
        /*InputStream is = new FileInputStream("D:\\IDEA_Project\\JavaSE\\src\\com\\api\\File\\zty.txt");
        byte[] buffer = new byte[3];//开发中使用byte[1024]
        int len;
        while((len = is.read(buffer)) !=-1){
            // 读取了多少就倒出多少！
            String rs = new String(buffer, 0, len);
            System.out.print(rs);
        }*/


        //定义一个字节数组与文件的大小刚刚一样大，然后一桶水读取全部字节数据再输出！
        //可以避免中文读取输出乱码，但是如果读取的文件过大，会出现内存溢出！！
        //字节流并不适合读取文本文件内容输出，读写文件内容建议使用字符流。

        File f = new File("D:\\\\IDEA_Project\\\\JavaSE\\\\src\\\\com\\\\api\\\\File\\\\zty.txt");
        InputStream is = new FileInputStream(f);
        byte[] buffer = new byte[(int) f.length()];
        int len = is.read(buffer);
        String rs = new String(buffer);
        System.out.println(rs);
    }

}