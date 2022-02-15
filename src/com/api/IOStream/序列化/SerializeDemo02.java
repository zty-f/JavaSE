package com.api.IOStream.序列化;

import java.io.*;
import java.util.Arrays;

//普通序列化
public class SerializeDemo02 {
    public static void main(String[] args) throws Exception {
        // 1.创建User用户对象
        User user = new User("zty","123456","fmj");
        // 2.创建低级的字节输出流通向目标文件
        OutputStream os = new FileOutputStream("src/com/api/IOStream/序列化/user-1.dat");
        // 3.把低级的字节输出流包装成高级的对象字节输出流 ObjectOutputStream
        // 序列化为二进制数据
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(user);	// 将该对象序列化为二进制数据
        oos.flush();
        byte[] bytes = bos.toByteArray();
        System.out.println(Arrays.toString(bytes));
        //[-84, -19, 0, 5, 115, 114, 0, 31, 99, 111, 109, 46, 97, 112, 105, 46, 73, 79, 83, 116, 114, 101, 97, 109, 46, -27, -70, -113, -27, -120, -105, -27, -116, -106, 46, 85, 115, 101, 114, 0, 0, 0, 0, 0, 0, 0, 1, 2, 0, 2, 76, 0, 9, 108, 111, 103, 105, 110, 78, 97, 109, 101, 116, 0, 18, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 83, 116, 114, 105, 110, 103, 59, 76, 0, 8, 117, 115, 101, 114, 78, 97, 109, 101, 113, 0, 126, 0, 1, 120, 112, 116, 0, 3, 122, 116, 121, 116, 0, 3, 102, 109, 106]
        os.write(bytes);
        os.close();
        oos.close();
        bos.close();
        System.out.println("序列化对象成功~~~~");
    }
}