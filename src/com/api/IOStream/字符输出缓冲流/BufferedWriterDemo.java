/**
 * @author: zty
 * @program: JavaSE
 * @ClassName BufferedWriterDemo
 * @description:
 * @create: 2022-02-15 16:01
 * @Version 1.0
 **/
package com.api.IOStream.字符输出缓冲流;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class BufferedWriterDemo {
    public static void main(String[] args) throws Exception {
        Writer fw = new FileWriter("src/com/api/IOStream/BufferedWriter",true);//追加
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("我爱学习Java");
        bw.newLine();//换行
        bw.close();
        fw.close();
    }
}
