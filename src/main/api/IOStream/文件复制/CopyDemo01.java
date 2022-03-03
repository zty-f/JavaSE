package main.api.IOStream.文件复制;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyDemo01 {
    public static void main(String[] args) {
        InputStream is = null ;
        OutputStream os = null ;
        try{
            //（1）创建一个字节输入流管道与源文件接通。
            is = new FileInputStream("D:\\IDEA_Project\\JavaSE\\src\\com\\api\\IOStream\\resourse.txt");
            //（2）创建一个字节输出流与目标文件接通。
            os = new FileOutputStream("D:\\IDEA_Project\\JavaSE\\src\\com\\api\\IOStream\\copy.txt");
            //（3）创建一个字节数组作为桶
            byte[] buffer = new byte[1024];
            //（4）从字节输入流管道中读取数据，写出到字节输出流管道即可
            int len = 0;
            //buffer中新读取的数据默认是覆盖原数据
            while((len = is.read(buffer)) != -1){
                os.write(buffer,0,len);
            }
            System.out.println("复制完成！");
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            /**（5）关闭资源！ */
            try{
                if(os!=null)os.close();
                if(is!=null)is.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}