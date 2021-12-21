package day06.demo04;

public class Demo01Person {

    public static void main(String[] args) {
        Person person = new Person();
        // 设置我自己的名字
        person.name = "老王";
        person.sayHello("小王");

        System.out.println(person); // 地址值
    }

}
