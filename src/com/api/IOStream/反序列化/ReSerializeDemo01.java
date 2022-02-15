package com.api.IOStream.反序列化;
import com.api.IOStream.序列化.User;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ReSerializeDemo01 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("src/com/api/IOStream/序列化/user.dat");
        ObjectInputStream ois = new ObjectInputStream(is);
        User user = (User)ois.readObject();//反序列化
        System.out.println(user);
        System.out.println("反序列化完成！");
    }
}