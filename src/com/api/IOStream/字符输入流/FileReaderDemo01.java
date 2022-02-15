package com.api.IOStream.字符输入流;

import java.io.FileReader;
import java.io.Reader;
//输入
public class FileReaderDemo01{//字符
    public static void main(String[] args) throws Exception {
        // 1.创建一个文件对象定位源文件
        // File f = new File("D:\IDEA_Project\JavaSE\src\com\api\IOStream\resourse.txt");
        // 2.创建一个字符输入流管道与源文件接通
        // Reader fr = new FileReader(f);
        // 3.简化写法：创建一个字符输入流管道与源文件路径接通
        Reader fr = new FileReader("D:\\IDEA_Project\\JavaSE\\src\\com\\api\\IOStream\\resourse.txt");
        //int code1 = fr.read();
		//System.out.print((char)code1);
        int ch;
        while((ch = fr.read()) != -1){
            System.out.print((char)ch);
        }
        fr.close();
    }
}