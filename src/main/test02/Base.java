package main.test02;

class Base { }
class Sub extends Base {
    public String getFields()
    {
        String name = "Sub";
        return name;
    }
}
class DoSub  {
    public static void main(String[] args) {
        Base b = new Sub();
        System.out.println(((Sub) b).getFields());//因为父类方法没有getFields方法
    }

}