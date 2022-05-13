package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

public class DecamelizeTest {
    public static void main(String[] args) {
        String test = "krótkaZabawnaFunkcja";
        System.out.println(StringFun.decamelize(test, 1) + "\n");

        System.out.println(StringFun.decamelize(test, 2) + "\n");
    }
}
