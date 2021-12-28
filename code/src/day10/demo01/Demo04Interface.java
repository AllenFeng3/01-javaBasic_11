package day10.demo01;

public class Demo04Interface {

    public static void main(String[] args) {
        MyInterfacePrivateB.methodStatic1();
        MyInterfacePrivateB.methodStatic2();

        // 错误写法！
//        MyInterfacePrivateB.methodStaticCommon();

        System.out.println("======================");
        MyInterfacePrivateBImpl myInterfacePrivateBImpl = new MyInterfacePrivateBImpl();
        myInterfacePrivateBImpl.methodDefault();
    }

}

class MyInterfacePrivateBImpl implements MyInterfacePrivateB {

}