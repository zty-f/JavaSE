/**
 * @author: zty
 * @program: JavaSE
 * @ClassName BufferedReaderDemo
 * @description:
 * @create: 2022-02-15 15:58
 * @Version 1.0
 **/
package com.api.IOStream.字符输入缓冲流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class BufferedReaderDemo {
    public static void main(String[] args) throws Exception {
        // 1.定义一个原始的字符输入流读取源文件
        Reader fr = new FileReader("src/com/api/IOStream/resourse.txt");
        // 2.把低级的字符输入流管道包装成一个高级的缓冲字符输入流管道
        BufferedReader br = new BufferedReader(fr);
        // 定义一个字符串变量存储每行数据
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        fr.close();
        br.close();
        //淘汰数组循环读取
        //char[] buffer = new char[1024];
        //int len;
        //while((len = br.read(buffer)) != -1){
        //System.out.println(new String(buffer , 0 , len));
    }
}
