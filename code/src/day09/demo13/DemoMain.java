package day09.demo13;

public class DemoMain {

    public static void main(String[] args) {
//        Animal animal = new Animal(); // 错误！

//        Dog dog = new Dog(); // 错误，这也是抽象类

        Dog2Ha ha = new Dog2Ha(); // 这是普通类，可以直接new对象。
        ha.eat();        //狗吃骨头
        ha.sleep();      //嘿嘿嘿……
        System.out.println("==========");

        DogGolden golden = new DogGolden();
        golden.eat();    //狗吃骨头
        golden.sleep();  //呼呼呼……
    }

}
