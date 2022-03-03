package main.api.IOStream.打印流;

import java.io.PrintStream;

public class PrintStreamDemo02 {
    public static void main(String[] args) throws Exception {
        System.out.println("==seazean0==");
        PrintStream ps = new PrintStream("src/com/api/IOStream/打印流/log.txt");
        System.setOut(ps); // 让系统的输出流向打印流
		//不输出在控制台，输出到文件里
        System.out.println("==seazean1==");
        System.out.println("==seazean2==");
    }
}