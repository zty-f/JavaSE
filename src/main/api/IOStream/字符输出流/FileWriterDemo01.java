/**
 * @author: zty
 * @program: JavaSE
 * @ClassName FileWriter
 * @description:
 * @create: 2022-02-14 21:48
 * @Version 1.0
 **/
package main.api.IOStream.字符输出流;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
//输出
public class FileWriterDemo01 {
    public static void main(String[] args) throws IOException {
        Writer fw = new FileWriter("D:\\IDEA_Project\\JavaSE\\src\\com\\api\\IOStream\\out");
        fw.write(97);   // 字符a
        fw.write('b');  // 字符b
        fw.write("Java是最优美的语言！");
        fw.write("\r\n");
        fw.close();
    }
}
