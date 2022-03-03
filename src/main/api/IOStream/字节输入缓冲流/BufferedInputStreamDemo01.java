package main.api.IOStream.字节输入缓冲流;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class BufferedInputStreamDemo01 {
    public static void main(String[] args) throws Exception {
        // 1.定义一个低级的字节输入流与源文件接通
        InputStream is = new FileInputStream("D:\\IDEA_Project\\JavaSE\\src\\com\\api\\IOStream\\resourse.txt");
        // 2.把低级的字节输入流包装成一个高级的缓冲字节输入流。
        BufferedInputStream bis = new BufferedInputStream(is);
        // 3.定义一个字节数组按照循环读取。
        byte[] buffer = new byte[1024];
        int len;
        while((len = bis.read(buffer)) != -1){
            String rs = new String(buffer, 0 , len);
            System.out.print(rs);
        }
        is.close();
        bis.close();
    }
}