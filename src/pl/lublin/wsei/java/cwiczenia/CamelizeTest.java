package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

public class CamelizeTest {
    public static void main(String[] args) {
        String test = "Krótka zabawna funkcja";
        System.out.println(StringFun.camelize(test) + "\n");

        test = "KRÓTKA zabawna Funkcja";
        System.out.println(StringFun.camelize(test) + "\n");

        test = "  krótka   zabawna funkcja    ";
        System.out.println(StringFun.camelize(test) + "\n");
    }
}
