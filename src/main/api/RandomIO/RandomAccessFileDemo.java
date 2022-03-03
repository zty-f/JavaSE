/**
 * @author: zty
 * @program: JavaSE
 * @ClassName RandomAccessFileDemo
 * @description:
 * @create: 2022-02-15 17:00
 * @Version 1.0
 **/
package main.api.RandomIO;

import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    public static void main(String[] args) throws Exception {
        RandomAccessFile rf = new RandomAccessFile(new File("src/com/api/RandomIO/test.txt"),"rw");
        rf.write("hello world".getBytes());
        rf.seek(5);//helloxxxxld  设置指针偏移，发生下一次读取或写入(插入+覆盖)时从当前位置开始。
        rf.write("xxxxxxxxxx".getBytes());
        rf.close();
    }
}
