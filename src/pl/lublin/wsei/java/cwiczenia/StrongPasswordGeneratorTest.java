package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.StrongPasswordGenerator;

public class StrongPasswordGeneratorTest {
    public static void main(String[] args) {
        String passwd = new StrongPasswordGenerator(16, true, true, true,true, "!@#^&").generate();
        System.out.println("\n" + passwd);
    }
}