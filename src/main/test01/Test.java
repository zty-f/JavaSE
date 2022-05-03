package main.test01;
/**
 * @ClassName: main.test.Test.java
 * @Copyright swpu
 * @author: zty-f
 * @date:  2022-03-18 17:21
 * @version V1.0
 * @Description:  多态调用顺序！！！！！！！！！！
 */
class Test {
    public static void main(String[] args) {
        System.out.println(new B().getValue());
    }
    static class A {
        protected int value;
        public A (int v) {
            setValue(v);//因为是B子类的实例，这里就会调用子类的setValue()方法
        }
        public void setValue(int value) {
            this.value= value;
        }
        public int getValue() {
            try {
                value ++;
                return value; //先保留value值，然后执行finally块，然后再继续return保留的value值
            } finally {
                this.setValue(value);
                System.out.println(value);
            }
        }
    }
    static class B extends A {
        public B () {
            super(5);
            setValue(getValue()- 3);
        }
        public void setValue(int value) {
            super.setValue(2 * value);
        }
    }
}