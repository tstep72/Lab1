package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Main {

    public static String leftPad(String aText, char aChar, int aWidth) {
        String res = aText;
        for (int i=0; i < (aWidth - aText.length()); i++) {
            res = aChar + res;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer num1 = 0;


        do {
            System.out.print("Podaj liczbę: ");
            num1 = input.nextInt();
            if (num1 == 0) break;
            System.out.printf("DEC = %d, BIN = %s, HEX = %s \n", num1,
                                                                leftPad(Integer.toBinaryString(num1), '0', 8),
                                                                '%' + leftPad(num1.toHexString(num1).toUpperCase(), '0', 4) );
        } while (true);

    }
}
