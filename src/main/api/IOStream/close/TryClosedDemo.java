/**
 * @author: zty
 * @program: JavaSE
 * @ClassName TryClosedDemo
 * @description:
 * @create: 2022-02-15 16:49
 * @Version 1.0
 **/
package main.api.IOStream.close;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class TryClosedDemo {
    public static void main(String[] args) {
        try( //这里只能放置资源对象，用完会自动调用close()关闭
                /* （1）创建一个字节输入流管道与源文件接通。 */
                InputStream is  = new FileInputStream("src/com/api/IOStream/resourse.txt");
                /* （2）创建一个字节输出流与目标文件接通。*/
                OutputStream os = new FileOutputStream("src/com/api/IOStream/close/test.txt");
                /* （5）关闭资源！是自动进行的 */
        ){
            byte[] buffer = new byte[1024];
            int len = 0;
            while((len = is.read(buffer)) != -1){
                os.write(buffer, 0 , len);
            }
            System.out.println("复制完成！");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
