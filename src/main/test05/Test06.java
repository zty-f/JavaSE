package main.test05;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @version V1.0
 * @ClassName: main.test05.Test06.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-09 17:38
 * @Description: 文件写测试
 */
public class Test06 {
    public static void main(String[] args) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("src/main/test05/data.txt");
        new DataInputStream(new InputStream() {    // extends FilterInputStream
            @Override
            public int read() throws IOException {
                return 0;
            }
        });

        outputStream.write('a');
        outputStream.write('a');  // 会把文件原内容全部删除，然后写入aa

        outputStream.close();

    }
}
