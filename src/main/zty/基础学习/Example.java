package main.zty.基础学习;


/*
访问权限
外部包 > 子类 > 本包 > 该类内部
public> protected > default > private
 */
public class Example{
    String str=new String("hello");//不可以改变，所以在方法中是值传递
    char[]ch={'a','b'};//引用传递
    public static void main(String args[]){
        Example ex=new Example();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+" and ");
        System.out.print(ex.ch);//hello and cb
    }
    public void change(String str,char ch[]){
        str="test ok";
        ch[0]='c';
    }
}