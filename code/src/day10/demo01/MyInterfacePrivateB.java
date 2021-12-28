package day10.demo01;

public interface MyInterfacePrivateB {

    public static void methodStatic1() {
        System.out.println("静态方法1");
        methodStaticCommon();
    }

    public static void methodStatic2() {
        System.out.println("静态方法2");
        methodStaticCommon();
    }

    default void methodDefault() {
        methodStaticCommon();
        methodStaticCommon2();
    }

    //static先于对象产生, 不能访问非静态.
    private static void methodStaticCommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

    private void methodStaticCommon2() {
        System.out.println("methodStaticCommon2");
    }

}
