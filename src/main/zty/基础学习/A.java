package main.zty.基础学习;

public class A implements B{
    public static void main(String args[]){
        int i;
        A a1=new  A();
        i =a1.k;
        System.out.println("i="+i);//10
    }
}
interface B{
    int k=10;
}