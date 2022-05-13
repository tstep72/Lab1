package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

public class IsPalindromeTest {
    public static void main(String[] args) {
        String test = "kajak";
        boolean palindrom = StringFun.isPalindrome(test);
        System.out.println("\n\"" + test + "\"" + (palindrom ? " jest" : " nie jest") + " palindromem.");

        test = "Kobyła ma mały bok";
        palindrom = StringFun.isPalindrome(test);
        System.out.println("\n\"" + test + "\"" + (palindrom ? " jest" : " nie jest") + " palindromem.");

        test = "Kobyła ma duży bok";
        palindrom = StringFun.isPalindrome(test);
        System.out.println("\n\"" + test + "\"" + (palindrom ? " jest" : " nie jest") + " palindromem.");

        test = "Madam, I'm Adam";
        palindrom = StringFun.isPalindrome(test);
        System.out.println("\n\"" + test + "\"" + (palindrom ? " jest" : " nie jest") + " palindromem.");

    }
}
