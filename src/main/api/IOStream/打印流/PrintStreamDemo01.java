package main.api.IOStream.打印流;

import java.io.PrintStream;
/*
可以方便，快速的写数据出去，可以实现打印什么类型，就是什么类型
PrintStream/PrintWriter 不光可以打印数据，还可以写字节数据和字符数据出去
System.out.print() 底层基于打印流实现的
 */
public class PrintStreamDemo01 {
    public static void main(String[] args) throws Exception {
        PrintStream ps = new  PrintStream("src/com/api/IOStream/打印流/dayin.txt");
        ps.println(123);
        ps.print("");//不换行
        ps.write("我爱你".getBytes());
        ps.close();
    }
}