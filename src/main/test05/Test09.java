package main.test05;

import java.io.*;

/**
 * @version V1.0
 * @ClassName: main.test05.Test09.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-09 20:30
 * @Description: 文件读
 */
public class Test09 {
    public static void main(String[] args) throws IOException {
        // 一个一个字节读取
        FileInputStream in = new FileInputStream("src/main/test05/test.txt");
        int x = 0;
        while ((x=in.read())!=-1){
            System.out.print((char) x);
        }
        System.out.println();

        // 读文件，一行一行读取！
        readFileByLines("src/main/test05/test.txt");
       File f = new File("src/main/test05/test.txt");
    }

    public static void readFileByLines(String fileName) {
        File file = new File(fileName);
        BufferedReader reader = null;
        try {
            System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                System.out.println("line " + line + ": " + tempString);
                line++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    }

}
