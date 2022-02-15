package com.api.IOStream.字符输入流;

import java.io.FileReader;
import java.io.Reader;
//输入
public class FileReaderDemo02 {//字符数组
    public static void main(String[] args) throws Exception {
        Reader fr = new FileReader("D:\\IDEA_Project\\JavaSE\\src\\com\\api\\IOStream\\resourse.txt");
        
        //char[] buffer = new char[3];
		//int len = fr.read(buffer);
		//System.out.println("字符数："+len);
		//String rs = new String(buffer,0,len);
		//System.out.println(rs);
        char[] buffer = new char[1024];
        int len;
        while((len = fr.read(buffer)) != -1) {
            System.out.print(new String(buffer, 0 , len));
        }
        fr.close();
    }
    /*
    字符流不能复制图片，视频等类型的文件。
    字符流在读取完了字节数据后并没有直接往目的地写，而是先查编码表，
    查到对应的数据就将该数据写入目的地。如果查不到，则码表会将一些未知区域中的数据
    去map这些字节数据，然后写到目的地，这样的话就造成了源数据和目的数据的不一致。
     */
}