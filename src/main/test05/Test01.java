package main.test05;/**
 * @ClassName: main.test05.Test01.java
 * @Copyright swpu
 * @author: zty-f
 * @date:  2022-09-05 17:40
 * @version V1.0
 * @Description: 字符加减测试
 */
public class Test01 {
    public static void main(String[] args) {
        char c = 'A';

        System.out.println(c+32);  // 这样相加最终是int类型 97

        //c = c+32;   不能这样赋值，会报错，需要强转类型为char

        char x = 'A'+32; // 这里加是int类型，然后转换成char
        System.out.println(x);  // a

        test("ahHHHbsbGe736 ddnG");

        test1("uidwHH*oIiOuhdododHYTYInn1255Hdjd",'1');
    }

    // 字符串大小写转换
    public static void test(String s){
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)){
                if (c<97){
                    c = (char) (c+32);
                }else {
                    c = (char) (c-32);
                }
            }
            res.append(c);
        }
        System.out.println(res);
    }

    // 字符串中某个字符的数量（不区分大小写）
    public static void test1(String s,char x){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)&&c==x){
                count++;
            }else if (Character.isLetter(c)&&(c==x||c+32==x||c-32==x)){
                count++;
            }
        }
        System.out.println(count);
    }
}
