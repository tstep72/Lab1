package pl.lublin.wsei.java.cwiczenia;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] liczby = new int[30];
        Random rnd = new Random();

        for(int i=0; i<30; i++) {
            liczby[i] = rnd.nextInt();
        }

        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        long avg = 0;
        for(int l : liczby) {
            System.out.println(l);
            if (l < mn) mn = l;
            if (l > mx) mx = l;
            avg += l;
        }
        System.out.printf("MIN = %d, MAX = %d, AVG = %f", mn, mx, (float)avg/liczby.length);

    }
}
