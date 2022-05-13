package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

public class ShuffleTest {
    public static void main(String[] args) {
        String test = "słowo";
        System.out.println(test + " --> " + StringFun.shuffle(test));
        test = "Całe długie zdanie";
        System.out.println(test + " --> " + StringFun.shuffle(test));
    }
}
