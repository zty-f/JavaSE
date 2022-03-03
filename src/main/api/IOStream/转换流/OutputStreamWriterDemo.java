/**
 * @author: zty
 * @program: JavaSE
 * @ClassName OutputStreamWriterDemo
 * @description:
 * @create: 2022-02-15 16:10
 * @Version 1.0
 **/
package main.api.IOStream.转换流;

import java.io.*;
/*
字符输出转换流：OutputStreamWriter

作用：可以指定编码把字节输出流转换成字符输出流，可以指定写出去的字符的编码
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("src/com/api/IOStream/out-OutputStreamWriter");
        OutputStreamWriter osw = new OutputStreamWriter(os,"UTF-8");
        osw.write("我在学习Java");
        osw.close();
    }
}
