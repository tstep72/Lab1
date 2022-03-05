package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        /*
        do {                      // wersja 1
            System.out.print("Podaj pierwszą liczbę: ");
            num1 = input.nextInt();
            if (num1 != 0) {
                System.out.print("Podaj drugą liczbę: ");
                num2 = input.nextInt();
            }
            System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);
        } while ((num1 != 0) && num2 != 0);
        */

        /*
        do {                     //wersja 2 - użycie break
            System.out.print("Podaj pierwszą liczbę: ");
            num1 = input.nextInt();
            if (num1 == 0) break;

            System.out.print("Podaj drugą liczbę: ");
            num2 = input.nextInt();
            if (num2 == 0) break;

            System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);
        } while (true);
        */

        do {                     //wersja 3 - Liczby obok siebie
            System.out.print("Podaj liczby: ");
            num1 = input.nextInt();
            num2 = input.nextInt();
            if (num1 == 0 || num2 == 0) break;
            System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);
        } while (true);

    }
}
