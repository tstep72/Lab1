package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

public class AnarchizeTest {
    public static void main(String[] args) {
        String test = "Test z dużej litery";
        System.out.println(StringFun.anarchize(test) + "\n");

        test = "test z małej litery";
        System.out.println(StringFun.anarchize(test) + "\n");

        test = "TEST WSZYSTKO DUŻYMI";
        System.out.println(StringFun.anarchize(test) + "\n");
    }
}
