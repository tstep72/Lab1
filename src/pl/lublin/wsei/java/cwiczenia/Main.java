package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;

public class Main {

    public static void main(String[] args) {
        Account acc = new Account();

        acc.setName("tomasz stępień");
        System.out.println(acc.getName());

        acc.setName("Антон Бабіак");
        System.out.println(acc.getName());

        acc.setName("tomaш бабіак");
        System.out.println(acc.getName());

    }
}
