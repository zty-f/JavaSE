package main.zty.常用数据结构总结;

import java.util.Arrays;

/**
 * @Copyright swpu
 * @author: zty-f
 * @date:  2022-03-13 15:44
 * @version V1.0
 * @Description:
 */
public class StringStudy {
    public static void main(String[] args) {
        String s = new String("ztyfmj");
        //先转换成StringBuffer，然后可以删除指定元素
        StringBuffer buffer = new StringBuffer(s);
        buffer.length();
        System.out.println(buffer.deleteCharAt(0));
        System.out.println(buffer.toString());
        //1.获取字符串长度
        System.out.println(s.length());//6
        //2.查找字符在字符串中第一次出现的位置
        System.out.println(s.indexOf('f'));//3
        //3.查找子字符串在字符串中第一次出现的位置
        System.out.println(s.indexOf("yf"));//2
        //4.同理上面2、3，不同的是最后一次出现的位置
        System.out.println(s.lastIndexOf('f'));//3
        System.out.println(s.lastIndexOf("yf"));//2
        //5.获取当前位置开始到字符串末尾的子字符串
        int beginIndex = 1;
        System.out.println(s.substring(beginIndex));//tyfmj
        //6.获取当前位置到结束位置的子字符串
        int endIndex = 4;
        System.out.println(s.substring(beginIndex,endIndex));//tyf
        String str1 = " a b c d";
        //7.去除字符串前后空格,不去除中间
        System.out.println(str1.trim());//a b c d
        //8.比较字符串的内容是否一致
        System.out.println(s.equals("ztyfmj"));//true
        String str2 = "aAbcD";
        //9.字符串每个字符都转大写
        System.out.println(str2.toUpperCase());//AABCD
        //10.转小写
        System.out.println(str2.toLowerCase());//aabcd
        //11.获取字符串中指定位置的字符
        System.out.println(s.charAt(4));//m
        //12.根据规则分割字符串
        String[] ss = str1.split(" ");//可以为正则表达式
        System.out.println(ss.length);//5 第一个为空字符没有处理
        for (String s1 : ss) {
            System.out.println(s1);
        }//  a b c d
        //13.字符串转化为字符数组
        System.out.println(Arrays.toString(s.getBytes()));//[122, 116, 121, 102, 109, 106]
        //14.左前缀匹配
        System.out.println(s.startsWith("zt"));//true
        System.out.println(s.startsWith("zt",1));//第二个参数表示开始比对的位置  false
        //16.右前缀匹配
        System.out.println(s.endsWith("mj"));//true
        //17.是否包含
        System.out.println(s.contains("zz"));//false
        System.out.println(s.contains("zty"));//true
    }
}
