/**
 * @author: zty
 * @program: JavaSE
 * @ClassName OutputStreamDemo01
 * @description:
 * @create: 2022-02-14 20:47
 * @Version 1.0
 **/
package main.api.IOStream.字节输出流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//输出流，向文件写数据！
public class OutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("D:\\IDEA_Project\\JavaSE\\src\\com\\api\\IOStream\\out");
        os.write(97);//a
        os.write('b');
        os.write("\r\n".getBytes());
        os.write("我爱Java".getBytes());
        os.close();
    }
}
