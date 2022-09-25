package main.test07;

/**
 * @version V1.0
 * @ClassName: main.test07.Test06.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-25 20:54
 * @Description: 字符串翻转单词
 */
public class Test06 {
    public static void main(String[] args) {
        reverseSentence("i am a student.you are very good.");
    }
    //核心代码
    public static void reverseSentence(String s){
        StringBuffer res = new StringBuffer();
        int index = 0;//用来记录每个句子的起始位置
        StringBuffer word = new StringBuffer();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isLetter(c)){//是英文单词，进行拼接组成单词
                word.append(c);
            }else if(c==' '||c=='.'){//是空格和.表示前一个单词已经完成，append到上一个单词前方即可
                if(res.length()!=index) res.insert(index," ");//不是首单词需要加空格保证格式
                res.insert(index,word);
                word.setLength(0);
                if(c=='.'){//最后一个单词完成，表示这个句子完成，需要更新index。
                    res.append('.');
                    index = res.length();
                }
            }
        }
        System.out.println(res.toString());
    }
}
