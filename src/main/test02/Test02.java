package main.test02;

public interface Test02 {
     static void a(){
        System.out.println("jdk1.8开始接口中可以有静态方法");
    }

    default void b(){//接口实现类可重写也可以不重写
        System.out.println("jdk1.8开始接口中允许有默认方法");
    }
}
class A implements Test02{

    public void a(){
        System.out.println("接口实现类中的方法！覆盖原静态方法");
    }

    @Override
    public void b() {
        System.out.println("接口实现类覆盖默认方法！");
    }

    public static void main(String[] args) {
        A a = new A();
        Test02.a();//静态方法可以通过接口名字调用
        a.a();
        a.b();
    }
}
