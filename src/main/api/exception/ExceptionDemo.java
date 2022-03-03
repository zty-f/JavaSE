package main.api.exception;

//运行时异常的处理规范：直接在最外层捕获处理即可，底层会自动抛出！！
public class ExceptionDemo{
    public static void main(String[] args){
        System.out.println("程序开始。。。。");
        try{
            chu(10 , 0);//ArithmeticException: / by zero
            System.out.println("操作成功！");//没输出
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("操作失败！");//输出了
        }
        System.out.println("程序结束。。。。");//输出了
    }
    
    public static void chu(int a , int b)  { System.out.println( a / b );}
}