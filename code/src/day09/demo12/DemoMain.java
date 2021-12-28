package day09.demo12;

public class DemoMain {

    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.eat();
        System.out.println("===============");
        MyAbstractImpl myAbs = new MyAbstractImpl();
        myAbs.method();

    }

}

class MyAbstractImpl extends MyAbstract {
    public MyAbstractImpl() {
        System.out.println("MyAbstractImpl 无参构造方法执行");
    }

    public void method() {
        System.out.println("method执行");
    }

}