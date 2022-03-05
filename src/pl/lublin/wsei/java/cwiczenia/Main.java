package pl.lublin.wsei.java.cwiczenia;

public class Main {
    public static void main(String[] args) {
        int liczba1 = 10;
        double liczba2 = 3.14;
        String tekst = "różne rzeczy";

        System.out.print("To");
        System.out.print("jest");
        System.out.print("print");

        System.out.println("To");
        System.out.println("jest");
        System.out.println("println");

        System.out.print("To\n");
        System.out.print("jest\n");
        System.out.print("print\n");

        System.out.printf("liczba1 = %d, liczba2 = %.2f, tekst = %20s %n", liczba1, liczba2, tekst);

        System.out.println("Nazywaliśmy to \"witaminą B3\"");

        System.out.printf("alfa\tsin(alfa)\n");     //tabela funkcji sinus
        for (int i=0; i<370; i+=10) {
            System.out.printf("%d\t%f\t\n", i, Math.sin(i/360.0*2*Math.PI));
        }

        System.out.printf("arg\tlog2(arg)\tsum(arg)\n");        //tabela logarytmów i sum potęg
        double suma = 0;
        for (int j=0; j<10; j+=1) {
            suma+=Math.pow(2, j);
            System.out.printf("%.0f\t%.0f\t%.0f\n", Math.pow(2, j), Math.log(Math.pow(2, j))/Math.log(2), suma);
        }
    }
}
