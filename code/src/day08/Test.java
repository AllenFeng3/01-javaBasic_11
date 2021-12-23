package day08;

public class Test {
    public static void main(String[] args) {
        String s1 = "abc";
        // 内存中有"abc"，"abcd"两个对象，s1从指向"abc"，改变指向，指向了"abcd"。
        s1+="d";
        System.out.println(s1); //abcd
        s1+='e';
        System.out.println(s1); //abcde

    }
}
