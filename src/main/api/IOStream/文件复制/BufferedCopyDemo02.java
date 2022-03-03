package main.api.IOStream.文件复制;

import java.io.*;

//使用高级的缓冲字节流复制文件
public class BufferedCopyDemo02 {
    public static void main(String[] args) {
        InputStream is = null ;
        OutputStream os = null ;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try{
            //（1）创建一个字节输入流管道与源文件接通。
            is = new FileInputStream("D:\\IDEA_Project\\JavaSE\\src\\com\\api\\IOStream\\resourse.txt");
            bis = new BufferedInputStream(is);
            //（2）创建一个字节输出流与目标文件接通。
            os = new FileOutputStream("D:\\IDEA_Project\\JavaSE\\src\\com\\api\\IOStream\\buffered-copy.txt");
            bos = new BufferedOutputStream(os);
            //（3）创建一个字节数组作为桶
            byte[] buffer = new byte[1024];
            //（4）从字节输入流管道中读取数据，写出到字节输出流管道即可
            int len = 0;
            //buffer中新读取的数据默认是覆盖原数据
            while((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
            System.out.println("复制完成！");
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            /**（5）关闭资源！ 注意先后顺序*/
            try{
                if(bos!=null)bos.close();
                if(bis!=null)bis.close();
                if(os!=null)os.close();
                if(is!=null)is.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}